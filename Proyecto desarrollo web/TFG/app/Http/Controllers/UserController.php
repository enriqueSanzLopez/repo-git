<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\User;
use Illuminate\Support\Facades\Auth;

class UserController extends Controller
{
    //
    public function borrar(User $user){
        if(Auth::user()->rol=='admin'){
            return view('contacts.borrar', compact('user'));
        }else{
            return redirect('/');
        }
    }
    public function destroy(User $user){
        if(Auth::user()->rol=='admin'){
            User::findOrFail($user->id)->delete();
            return redirect('contacts');
        }else{
            return redirect('/');
        }
    }
}
