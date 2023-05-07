<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class PMessage extends Model
{
    use HasFactory;
    protected $table='messages_project';
    public function project(){
        return $this->belongsTo(Project::class);
    }
    public function user(){
        return $this->belongsTo(User::class);
    }
}
