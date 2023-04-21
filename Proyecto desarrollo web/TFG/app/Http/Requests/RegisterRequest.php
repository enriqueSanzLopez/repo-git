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
    public function authorize(): bool
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\Rule|array|string>
     */
    public function rules()
    {
        return [
            //
            'name'=>['required', 'string', 'unique:users', 'min:2', 'max:255'],
            'email'=>['required', 'string', 'email', 'unique:users', 'max:255'],
            'password'=>['required', 'confirmed', Rules\Password::defaults()],
        ];
    }
    public function messages()
    {
        return [
            'name.required'=>'El nombre es obligatorio.',
            'name.unique'=>'El nombre seleccionado ya existe.',
            'name.min'=>'El nombre debe tener como mínimo 2 caracteres.',
            'name.max'=>'El nombre debe tener como máximo 255 caracteres.',
            'email.required'=>'El email es obligatorio.',
            'email.email'=>'El email tiene que tener un formato de email.',
            'email.unique'=>'El email seleccionado no está disponible, usa otro.',
            'email.max'=>'El nombre debe tener como máximo 255 caracteres',
            'password.required'=>'La contraseña es obligatoria.',
            'password.confirmed'=>'Las contraseñas no coinciden.',
            'password.min'=>'La contraseña debe tener como mínimo 8 caracteres',
        ];
    }
}
