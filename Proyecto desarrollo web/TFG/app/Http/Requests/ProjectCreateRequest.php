<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class ProjectCreateRequest extends FormRequest
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
            'name' => 'required|string|max:255',
        ];
    }
    public function messages()
    {
        return [
            'name.required'=>'El nombre del proyecto es obligatorio.',
            'name.max'=>'El nombre debe tener un máximo de 255 caracteres.',
        ];
    }
}
