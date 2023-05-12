<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\LoginController;
use App\Http\Controllers\ProjectController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\ContactController;
use App\Http\Controllers\SprintController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\CalendarController;
use Illuminate\Support\Facades\App;

App::setLocale('es');
if(isset($_COOKIE['lenguaje'])){
    App::setLocale($_COOKIE['lenguaje']);
}

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

Route::get('projects', [ProjectController::class, 'index'])->name('projects')->middleware('auth');

Route::get('projects.create', [ProjectController::class, 'create'])->name('projects.create')->middleware('auth');

Route::post('projects.store', [ProjectController::class, 'store'])->name('projects.store')->middleware('auth');

Route::get('projects.show/{project}', [ProjectController::class, 'show'])->name('projects.show')->middleware('auth');

Route::get('projects.edit/{project}', [ProjectController::class, 'edit'])->name('projects.edit')->middleware('auth');

Route::post('projects.update/{project}', [ProjectController::class, 'update'])->name('projects.update')->middleware('auth');

Route::get('projects.borrar/{project}', [ProjectController::class, 'borrar'])->name('projects.borrar')->middleware('auth');

Route::get('projects.destroy/{project}', [ProjectController::class, 'destroy'])->name('projects.destroy')->middleware('auth');

//Rutas de Sprints

Route::get('sprints', [SprintController::class, 'index'])->name('sprints')->middleware('auth');

Route::get('sprints.create', [SprintController::class, 'create'])->name('sprints.create')->middleware('auth');

Route::post('sprints.store', [SprintController::class, 'store'])->name('sprints.store')->middleware('auth');

Route::get('sprints.show/{sprint}', [SprintController::class, 'show'])->name('sprints.show')->middleware('auth');

Route::get('sprints.edit/{sprint}', [SprintController::class, 'edit'])->name('sprints.edit')->middleware('auth');

Route::post('sprints.update/{sprint}', [SprintController::class, 'update'])->name('sprints.update')->middleware('auth');

Route::get('sprints.borrar/{sprint}', [SprintController::class, 'borrar'])->name('sprints.borrar')->middleware('auth');

Route::get('sprints.destroy/{sprint}', [SprintController::class, 'destroy'])->name('sprints.destroy')->middleware('auth');

//Rutas de Tasks

Route::get('tasks', [TaskController::class, 'index'])->name('tasks')->middleware('auth');

Route::get('tasks.create', [TaskController::class, 'create'])->name('tasks.create')->middleware('auth');

Route::post('tasks.store', [TaskController::class, 'store'])->name('tasks.store')->middleware('auth');

Route::get('tasks.show/{task}', [TaskController::class, 'show'])->name('tasks.show')->middleware('auth');

Route::get('tasks.borrar/{task}', [TaskController::class, 'borrar'])->name('tasks.borrar')->middleware('auth');

Route::get('tasks.destroy/{task}', [TaskController::class, 'destroy'])->name('tasks.destroy')->middleware('auth');

Route::get('tasks.edit/{task}', [TaskController::class, 'edit'])->name('tasks.edit')->middleware('auth');

Route::post('tasks.update/{task}', [TaskController::class, 'update'])->name('tasks.update')->middleware('auth');

//Rutas de contactos

Route::get('contacts', [ContactController::class, 'index'])->name('contacts')->middleware('auth');

//Rutas de usuarios

Route::get('users.borrar/{user}', [UserController::class, 'borrar'])->name('users.borrar')->middleware('auth');

Route::get('users.destroy/{user}', [UserController::class, 'destroy'])->name('users.destroy')->middleware('auth');

//Ruta de calendario
Route::get('calendar', [CalendarController::class, 'show'])->name('calendar')->middleware('auth');
