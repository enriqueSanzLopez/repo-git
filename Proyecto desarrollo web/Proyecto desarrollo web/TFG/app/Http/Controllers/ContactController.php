<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Contact;
use App\Models\User;

class ContactController extends Controller
{
    //
    public function index(){
        $users=User::paginate(10);
        return view('contacts.index', compact('users'));
    }
}
