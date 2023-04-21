<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Hash;
use App\Http\Requests\RegisterRequest;

class LoginController extends Controller
{
    //
    public function registerForm(){
        return view('login.register');
    }

    public function loginForm(){
        return view('login.login');
    }

    public function registro(RegisterRequest $request){
        $user=new User();
        $user->name=$request->get('name');
        $user->email=$request->get('email');
        $user->password=Hash::make($request->get('password'));
        $user->save();
        return redirect()->route('login');
    }

    public function login(Request $request){
        $credenciales=$request->only('name', 'password');
        if(Auth::guard('web')->attempt($credenciales)){
            $request->session()->regenerate();
            return redirect()->route('inicio');
        }else{
            $error='Error al acceder a la aplicación.';
            return view('login.login', compact('error'));
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
