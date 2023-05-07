<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Task extends Model
{
    use HasFactory;
    protected $table='tasks';
    protected $primarykey='id';
    protected $fillable=['name', 'sprint', 'state', 'description'];
    public function users(){
        return $this->belongsToMany(User::class);
    }
    public function sprint(){
        return $this->belongsTo(Sprint::class);
    }
    public function messages(){
        return $this->hasMany(TMessage::class);
    }
}
