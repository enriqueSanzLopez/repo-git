<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('message_user', function (Blueprint $table) {
            $table->foreignId('receiver')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreignId('message')->references('id')->on('messages')->onUpdate('cascade')->onDelete('cascade');
            $table->unique(['receiver', 'message'], 'claves_ajenas');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('message_user');
    }
};
