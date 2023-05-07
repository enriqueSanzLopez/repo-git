<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\Api\UserApiController;
use App\Http\Controllers\Api\ProjectApiController;
use App\Http\Controllers\Api\TaskApiController;


/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

Route::post('users.rol', [UserApiController::class, 'rol'])->name('users.rol');

Route::get('users.buscaruser', [UserApiController::class, 'buscarUser'])->name('users.buscaruser');

//Rutas para apuntar usuarios a proyectos, y tareas

Route::post('projects.apuntar', [ProjectApiController::class, 'apuntar'])->name('projects.apuntar');

Route::post('projects.desapuntar', [ProjectApiController::class, 'desapuntar'])->name('projects.desapuntar');

Route::post('tasks.apuntar', [TaskApiController::class, 'apuntar'])->name('tasks.apuntar');

Route::post('tasks.desapuntar', [TaskApiController::class, 'desapuntar'])->name('tasks.desapuntar');
