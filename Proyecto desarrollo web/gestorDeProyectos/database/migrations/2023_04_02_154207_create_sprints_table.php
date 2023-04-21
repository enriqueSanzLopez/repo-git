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
        Schema::create('sprints', function (Blueprint $table) {
            $table->id();
            $table->foreignId('project')->references('id')->on('projects')->onUpdate('cascade')->onDelete('cascade');
            $table->date('start_date');
            $table->date('limit_date');
            $table->text('backlog')->nullable();
            $table->text('description')->nullable();
            $table->text('retrospective')->nullable();
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('sprints');
    }
};
