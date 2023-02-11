<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Validation\Rules;

class RegisterRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     *
     * @return bool
     */
    public function authorize()
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, mixed>
     */
    public function rules()
    {
        return [
            //
            'name'=>['required', 'string', 'unique:users'],
            'email'=>['required', 'string', 'email', 'unique:users' ],
            'password'=>['required', 'confirmed', Rules\Password::defaults()],
            'birthday'=>['required', 'date'],
            'image'=>['image'],
        ];
    }
    public function messages()
    {
        return [
            'name.required'=>'El nombre es obligatorio.',
            'name.unique'=>'El nombre seleccionado no está disponible, usa otro.',
            'email.required'=>'El email es obligatorio',
            'email.email'=>'El email tiene que tener un formato de email.',
            'email.unique'=>'El email seleccionado no está disponible, usa otro.',
            'password.required'=>'La contraseña es obligatoria.',
            'password.confirmed'=>'No has repetido la contraseña correctamente.',
            'birthday.required'=>'La fecha de nacimiento es obligatoria.',
            'birthday.date'=>'La fecha de nacimiento tiene que tener un formato de fecha.',
            'image.image'=>'La foto tiene que tener un formato de imagen.',
        ];
    }
}
