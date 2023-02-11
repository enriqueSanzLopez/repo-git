<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class MessageRequest extends FormRequest
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
            'name'=>'required|string',
            'subject'=>'required|string',
            'text'=>'required'
        ];
    }
    public function messages()
    {
        return [
            'name.required'=>'Debes identificarte en el mensaje.',
            'name.string'=>'El nombre tiene que ser una cadena de caracteres.',
            'subject.required'=>'Tienes que indicar el asunto.',
            'subject.string'=>'El asunto tiene que ser una cadena de caracteres.',
            'text.required'=>'No puedes dejar el mensaje vacío.'
        ];
    }
}
