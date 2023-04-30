<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class UserApiController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function show(User $user)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, User $user)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\User  $user
     * @return \Illuminate\Http\Response
     */
    public function destroy(User $user)
    {
        //
    }

    public function rol(){
        if(Auth::user()->rol=='admin'){//Solo se activa si el usuario es administrador
            $user=User::findOrFail($_GET['id']);
            if($_GET['valor']==0){
                $user->rol='user';
            }else if($_GET['valor']==1){
                $user->rol='admin';
            }
            // if($request->get('valor')==0){//Convertir en usuario normal en caso de que se pida
            //     $user->rol='user';
            // }else if($request->get('valor')==1){//Convertir en administrador
            //     $user->rol='admin';
            // }
            // $user->save();//Guardar el rol de usuario
            // return response()->json('Todo correcto', 200);
        }
    }
}
