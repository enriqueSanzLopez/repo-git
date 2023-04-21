<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class TaskEditRequest extends FormRequest
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
            'sprint_id'=>'required|exists:sprints,id',
            'name'=>'required|string',
        ];
    }
    public function messages()
    {
        return [
            'sprint_id.required'=>'Tienes que indicar a que proyecto pertenece el Sprint',
            'name.required'=>'Debes ponerle algún nombre al sprint.',
        ];
    }
}
