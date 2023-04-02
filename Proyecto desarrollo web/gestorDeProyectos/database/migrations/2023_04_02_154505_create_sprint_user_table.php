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
        Schema::create('sprint_user', function (Blueprint $table) {
            $table->foreignId('worker')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreignId('sprint')->references('id')->on('sprints')->onUpdate('cascade')->onDelete('cascade');
            $table->unique(['worker', 'sprint'], 'claves_ajenas');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('sprint_user');
    }
};
