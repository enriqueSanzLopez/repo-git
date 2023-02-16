<?php

use App\Http\Controllers\EventController;
use App\Http\Controllers\MessageController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\LoginController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('index');
})->name('inicio');

Route::get('politica', function(){
    return view('cookies.politica');
})->name('politica');

Route::get('privacidad', function(){
    return view('cookies.privacidad');
})->name('privacidad');

Route::get('configuracion', function(){
    return view('cookies.configuracion');
})->name('configuracion');

Route::get('terminos', function(){
    return view('cookies.terminos');
})->name('terminos');

Route::get('lugar', function(){
    return view('lugar');
})->name('lugar');

Route::resource('events', EventController::class);

Route::resource('messages', MessageController::class);

Route::get('registro', [LoginController::class, 'registerForm']);

Route::post('registro', [LoginController::class, 'register'])->name('registro');

Route::get('login', [LoginController::class, 'loginForm']);

Route::post('login', [LoginController::class, 'login'])->name('login');

Route::get('logout', [LoginController::class, 'logout'])->name('logout');

Route::get('members', [LoginController::class, 'showMembers'])->name('members');

Route::get('member/{user}', [LoginController::class, 'show'])->name('member');

Route::get('edit/{user}', [LoginController::class, 'edit'])->name('edit');

Route::put('update/{user}', [LoginController::class, 'update'])->name('update');

Route::get('cuenta', function(){
    return view('auth.account');
})->name('users.account')->middleware('auth');
