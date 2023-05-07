<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Contact;
use App\Models\User;
use Illuminate\Support\Facades\Auth;

class ContactController extends Controller
{
    //
    public function index(){
        if(Auth::user()->rol!='admin'){
            return redirect('inicio');
        }
        $users=User::paginate(10);
        return view('contacts.index', compact('users'));
    }
}
