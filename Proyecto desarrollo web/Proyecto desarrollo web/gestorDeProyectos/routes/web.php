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

//Rutas de Tasks

Route::get('tasks', [TaskController::class, 'index'])->name('tasks');

//Rutas de contactos

Route::get('contacts', [ContactController::class, 'index'])->name('contacts');
