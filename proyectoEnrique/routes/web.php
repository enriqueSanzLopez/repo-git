<?php

use App\Http\Controllers\EventController;
use App\Http\Controllers\MessageController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\StaticController;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\UserController;

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

Route::get('/', [StaticController::class, 'inicio'])->name('inicio');

Route::get('politica', [StaticController::class, 'politica'])->name('politica');

Route::get('privacidad', [StaticController::class, 'privacidad'])->name('privacidad');

Route::get('configuracion', [StaticController::class, 'configuracion'])->name('configuracion');

Route::get('terminos', [StaticController::class, 'terminos'])->name('terminos');

Route::get('lugar', [StaticController::class, 'lugar'])->name('lugar');

Route::get('cuenta', [StaticController::class, 'cuenta'])->name('users.account')->middleware('auth');

Route::resource('events', EventController::class);

Route::get('events.apuntar/{event}', [EventController::class, 'apuntar'])->name('events.apuntar')->middleware('auth');

Route::resource('messages', MessageController::class);

Route::get('registro', [LoginController::class, 'registerForm']);

Route::post('registro', [LoginController::class, 'register'])->name('registro');

Route::get('login', [LoginController::class, 'loginForm']);

Route::post('login', [LoginController::class, 'login'])->name('login');

Route::get('logout', [LoginController::class, 'logout'])->name('logout');

Route::resource('users', UserController::class);

