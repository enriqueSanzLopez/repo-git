<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('_messages_project', function (Blueprint $table) {
            $table->foreignId('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreignId('project_id')->references('id')->on('projects')->onUpdate('cascade')->onDelete('cascade');
            $table->dateTime('fecha', $precision = 0);
            $table->text('commentario');
            $table->unique(['project_id', 'user_id', 'fecha'], 'claves_ajenas');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('_messages_project');
    }
};
