<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\ProjectController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\ContactController;
use App\Http\Controllers\SprintController;
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

Route::get('/', function () {
    return view('index');
})->name('inicio');

Route::get('registro', [LoginController::class, 'registerForm'])->name('registro');

Route::post('registroddbb', [LoginController::class, 'registro'])->name('registroddbb');

Route::get('login', [LoginController::class, 'loginForm'])->name('login');

Route::post('loginddbb', [LoginController::class, 'login'])->name('loginddbb');

Route::get('logout', [LoginController::class, 'logout'])->name('logout');

//Rutas de proyectos

Route::get('projects', [ProjectController::class, 'index'])->name('projects');

Route::get('projects.create', [ProjectController::class, 'create'])->name('projects.create');

Route::post('projects.store', [ProjectController::class, 'store'])->name('projects.store');

Route::get('projects.show/{project}', [ProjectController::class, 'show'])->name('projects.show');

Route::get('projects.edit/{project}', [ProjectController::class, 'edit'])->name('projects.edit');

Route::post('projects.update/{project}', [ProjectController::class, 'update'])->name('projects.update');

Route::get('projects.borrar/{project}', [ProjectController::class, 'borrar'])->name('projects.borrar');

Route::get('projects.destroy/{project}', [ProjectController::class, 'destroy'])->name('projects.destroy');

//Rutas de Sprints

Route::get('sprints', [SprintController::class, 'index'])->name('sprints');

Route::get('sprints.create', [SprintController::class, 'create'])->name('sprints.create');

Route::post('sprints.store', [SprintController::class, 'store'])->name('sprints.store');

Route::get('sprints.show/{sprint}', [SprintController::class, 'show'])->name('sprints.show');

Route::get('sprints.edit/{sprint}', [SprintController::class, 'edit'])->name('sprints.edit');

Route::post('sprints.update/{sprint}', [SprintController::class, 'update'])->name('sprints.update');

Route::get('sprints.borrar/{sprint}', [SprintController::class, 'borrar'])->name('sprints.borrar');

Route::get('sprints.destroy/{sprint}', [SprintController::class, 'destroy'])->name('sprints.destroy');

//Rutas de Tasks

Route::get('tasks', [TaskController::class, 'index'])->name('tasks');

Route::get('tasks.create', [TaskController::class, 'create'])->name('tasks.create');

Route::post('tasks.store', [TaskController::class, 'store'])->name('tasks.store');

Route::get('tasks.show/{task}', [TaskController::class, 'show'])->name('tasks.show');

Route::get('tasks.borrar/{task}', [TaskController::class, 'borrar'])->name('tasks.borrar');

Route::get('tasks.destroy/{task}', [TaskController::class, 'destroy'])->name('tasks.destroy');

Route::get('tasks.edit/{task}', [TaskController::class, 'edit'])->name('tasks.edit');

Route::post('tasks.update/{task}', [TaskController::class, 'update'])->name('tasks.update');

//Rutas de contactos

Route::get('contacts', [ContactController::class, 'index'])->name('contacts');

//Rutas de usuarios

Route::get('users.borrar/{user}', [UserController::class, 'borrar'])->name('users.borrar');

Route::get('users.destroy/{user}', [UserController::class, 'destroy'])->name('users.destroy');
