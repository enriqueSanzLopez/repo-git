<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Requests\RegisterRequest;
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
        // if(strrpos($request->file('image'))==false){}elseif(){}else{}
        // $request->file('image')->storeAs('public/img/usuarios', $request->get('name')); //Guardar la imagen de usuario
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
        if (Auth::guard('web')->attempt($credenciales)) { //Se intenta abrir sesión, si falla, se devuelve a login con un mensaje de error
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
}
