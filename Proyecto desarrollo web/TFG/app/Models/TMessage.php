<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class TMessage extends Model
{
    use HasFactory;
    protected $table='messages_task';
    public function task(){
        return $this->belongsTo(Task::class);
    }
    public function user(){
        return $this->belongsTo(User::class);
    }
}
