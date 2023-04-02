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
        Schema::create('project_user', function (Blueprint $table) {
            $table->foreignId('worker')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreignId('project')->references('id')->on('projects')->onUpdate('cascade')->onDelete('cascade');
            $table->unique(['worker', 'project'], 'claves_ajenas');
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('project_user');
    }
};