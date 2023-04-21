<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class SprintEditRequest extends FormRequest
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
            'project_id'=>'required|exists:projects,id',
            'name'=>'required|string',
            'start_date'=>'required',
            'limit_date'=>'required',
        ];
    }
    public function messages()
    {
        return [
            'project_id.required'=>'Tienes que indicar a que proyecto pertenece el Sprint',
            'name.required'=>'Debes ponerle algún nombre al sprint.',
            'start_date.required'=>'Tienes que indicar la fecha de inicio del Sprint',
            'limit_date.required'=>'Tienes que indicar la fecha límite del Sprint',
        ];
    }
}
