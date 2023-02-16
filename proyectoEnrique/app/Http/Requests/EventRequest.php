<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class EventRequest extends FormRequest
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
            'tags'=>'required|string',
            'location'=>'required|string',
            'date'=>'required|date',
            'hour'=>'required|date_format:H:i',
            'description'=>'required',
        ];
    }
    public function messages()
    {
        return [
            'name.required'=>'El nombre del evento es obligatorio.',
            'name.string'=>'El nombre tiene que ser una cadena de caracteres.',
            'tags.required'=>'Los tags son obligatorios.',
            'tags.string'=>'Los tags tienen que ser una cadena de caracteres.',
            'location.required'=>'Tienes que indicar la localización del evento.',
            'location.string'=>'La localización tiene que ser una cadena de caracteres.',
            'date.required'=>'Tienes que indicar la fecha del evento.',
            'date.date'=>'La fecha del evento tiene que tener un formato de fecha.',
            'hour.required'=>'Tienes que indicar la hora a la que se celebrará el proyecto.',
            'hour.date_format'=>'La hora del evento tiene que tener un formato de hora:minuto.',
            'description.required'=>'Debes describir el evento.',
        ];
    }
}
