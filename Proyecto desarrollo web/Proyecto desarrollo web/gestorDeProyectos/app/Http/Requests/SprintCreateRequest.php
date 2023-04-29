<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class SprintCreateRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
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
            'project'=>'required|exists:projects,id',
            'start_date'=>'required',
            'limit_date'=>'required',
        ];
    }
    public function messages()
    {
        return [
            'project.required'=>'Tienes que indicar a que proyecto pertenece el Sprint',
            'start_date.required'=>'Tienes que indicar la fecha de inicio del Sprint',
            'limit_date.required'=>'Tienes que indicar la fecha límite del Sprint',
        ];
    }
}
