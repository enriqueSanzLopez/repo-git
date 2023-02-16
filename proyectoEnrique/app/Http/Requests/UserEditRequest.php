<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Validation\Rules;

class UserEditRequest extends FormRequest
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
            'password'=>['required', 'confirmed', Rules\Password::defaults()],
            'birthday'=>['required', 'date'],
            // 'image'=>['image'],
        ];
    }
    public function messages()
    {
        return [
            'password.required'=>'Tienes que indicar una contraseña, crea una nueva, o usa la vieja.',
            'password.confirmed'=>'No has repetido la contraseña correctamente.',
            'birthday.required'=>'La fecha de nacimiento es obligatoria.',
            'birthday.date'=>'La fecha de nacimiento tiene que tener un formato de fecha.',
            'image.image'=>'La foto tiene que tener un formato de imagen.',
        ];
    }
}
