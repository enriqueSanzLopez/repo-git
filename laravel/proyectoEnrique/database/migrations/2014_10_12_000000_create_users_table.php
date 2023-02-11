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
        Schema::create('users', function (Blueprint $table) {
            $table->id();
            $table->string('name')->unique();//Único para que pueda usarse para los nombres de las fotos de perfil y de clave foránea
            $table->string('email')->unique();
            $table->timestamp('email_verified_at')->nullable();
            $table->string('password');
            $table->date('birthday');//Se asume que no es nullable porque es posible que en el futuro algunos eventos o contenido de la aplicación no sea apto para menores
            $table->enum('rol', ['member', 'admin'])->default('member');
            $table->text('twitter')->nullable();//Se asume que son nullable porque el usuario no tiene por que tener 3 cuentas de redes sociales para crearse una cuenta como fan de un foro
            $table->text('instagram')->nullable();
            $table->text('twitch')->nullable();
            $table->rememberToken();
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('users');
    }
};
