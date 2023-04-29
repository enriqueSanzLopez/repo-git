<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Task extends Model
{
    use HasFactory;
    public function users(){
        return $this->belongsToMany(User::class);
    }
    public function sprint(){
        return $this->belongsTo(Sprint::class);
    }
}
