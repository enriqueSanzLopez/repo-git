<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\ProjectController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\ContactController;
use App\Http\Controllers\SprintController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('index');
})->name('inicio');

Route::get('registro', [LoginController::class, 'registerForm'])->name('registro');

Route::post('registroddbb', [LoginController::class, 'registro'])->name('registroddbb');

Route::get('login', [LoginController::class, 'loginForm'])->name('login');

Route::post('loginddbb', [LoginController::class, 'login'])->name('loginddbb');

Route::get('logout', [LoginController::class, 'logout'])->name('logout');

Route::get('projects', [ProjectController::class, 'index'])->name('projects');

Route::get('projects.create', [ProjectController::class, 'create'])->name('projects.create');

Route::post('projects.store', [ProjectController::class, 'store'])->name('projects.store');

Route::get('sprints', [SprintController::class, 'index'])->name('sprints');

Route::get('tasks', [TaskController::class, 'index'])->name('tasks');

Route::get('contacts', [ContactController::class, 'index'])->name('contacts');
