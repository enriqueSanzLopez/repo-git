<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Requests\RegisterRequest;
use App\Http\Requests\UserEditRequest;
use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Hash;

class LoginController extends Controller
{
    //
    public function registerForm()
    {
        return view('auth.register');
    }
    public function register(RegisterRequest $request)
    {
        $user = new User(); //Crear objeto usuario
        $user->name = $request->get('name'); //Guardar los datos en el objeto
        $user->email = $request->get('email');
        $user->password = Hash::make($request->get('password')); //Codificar la contraseña
        $user->birthday = $request->get('birthday');
        $user->twitter = $request->get('twitter');
        $user->instagram = $request->get('instagram');
        $user->twitch = $request->get('twitch');
        $user->save(); //Guardar el objeto en la base de datos
        Auth::login($user);
        if($request->hasFile('image')){//Se ha enviado imagen de perfil
            $image=$request->file('image');//Guardar la imagen
            $image->storeAs('public/img/usuarios/', $user->id.'.png');
        }
        return redirect()->route('users.account');
    }
    public function loginForm()
    {
        if (Auth::viaRemember() or Auth::check()) { //Se ha comprobado que la sesión está iniciada
            return redirect()->route('users.account');
        } else { //La sesión no está iniciada
            return view('auth.login');
        }
    }
    public function login(Request $request)
    {
        $credenciales = $request->only('name', 'password');
        $recordar= (request()->remember) ? true : false;
        if (Auth::guard('web')->attempt($credenciales, $recordar)) { //Se intenta abrir sesión, si falla, se devuelve a login con un mensaje de error
            $request->session()->regenerate();
            return redirect()->route('users.account');
        } else {
            return view('auth.login');
        }
    }
    public function logout(Request $request)
    {
        Auth::guard('web')->logout();
        $request->session()->invalidate();
        $request->session()->regenerateToken();
        return redirect('/');
    }
    public function showMembers(){
        $users=User::all();//Conseguir todo los miembros de la aplicación
        return view('auth.members', compact('users'));
    }
    public function show(User $user){
        return view('auth.show', compact('user'));
    }
    public function edit(User $user){
        if(!isset(Auth::user()->name)){
            return redirect('inicio');
        }
        return view('auth.edit', compact('user'));
    }
    public function update(UserEditRequest $request, User $user){
        if(!isset(Auth::user()->name)){
            return redirect('inicio');
        }
        $user->password=Hash::make($request->get('password'));
        $user->birthday = $request->get('birthday');
        $user->twitter = $request->get('twitter');
        $user->instagram = $request->get('instagram');
        $user->twitch = $request->get('twitch');
        $user->save();
        if($request->hasFile('image')){//Se ha enviado imagen de perfil
            $image=$request->file('image');//Guardar la imagen
            $image->storeAs('public/img/usuarios/', $user->id.'.png');
        }
        return redirect()->route('users.account');
    }
}
