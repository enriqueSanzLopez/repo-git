package actividadevaluable2;
import java.util.*;
public class ejercicio1 {
	public static void main(String arg[]) {
		Scanner src=new Scanner(System.in);
		String asignaturas="", prueba="", alumnos="", email="", nombre, resultado="", NIAs="", correos="", nombres="";
		String[] separadas;
		String[] s_alumnosc;
		String[] s_alumnosf;
		String[] s_nombres;
		String[] s_NIAs;
		String[] s_correos;
		String[] s_resultados;
		int n_asig=0, i=0, k, n_alumnos=0, es, com, NIA, j=-1;
		//Numeros aleatorios
		Random r=new Random();
		boolean a=false, salir=false;
		//Paso 1
		System.out.println("Paso 1: Introduzca el numero de asignaturas");
		n_asig=src.nextInt();
		//Vaciar el buffer
		src.nextLine();
		//Obtener las asignaturas y separarlas por guiones
		if(n_asig!=0){do {
			System.out.printf("Introduzca el nombre de la asignatura %d/%d :\n",(i+1),n_asig);
			if(i!=0) {
				//No es la primera asignatura
				prueba=src.nextLine();
				k=asignaturas.indexOf(prueba);
				if(k==-1) {
					//No esta repetida la asignatura
					asignaturas=asignaturas+prueba+"-";
					i=i+1;
				}else {
					//Esta repetida
					System.out.println("ERROR: No repita las asignaturas");
				}
			}else {
				//Es la primera asignatura
				asignaturas=asignaturas+src.nextLine()+"-";
				i=i+1;
			}
		}while(i<n_asig);}
		//Separar las asignaturas mediante los guiones
		separadas=asignaturas.split("-");
		//Mostrar las asignaturas por pantalla
		for(i=0;i<separadas.length;i++) {
			System.out.print(separadas[i]+" ");
		}
		//Paso 2
		i=0;
		System.out.println("\nPaso 2: Introduzca el numero de alumnos");
		n_alumnos=src.nextInt();
		//Vaciar el Buffer
		src.nextLine();
		//Introducir los datos del alumno
		if(n_alumnos!=0){do {
			//Calcular el NIA del alumno y asignarselo a alumnos
			NIA=(int)(r.nextDouble()*500+100);
			NIAs=NIAs+NIA+"-";
			alumnos=alumnos+NIA+"-";
			//Introducir el nombre
			System.out.printf("Introduzca los datos del alumno %d/%d :\n",(i+1),n_alumnos);
			System.out.println("Introduzca el nombre:");
			nombre=src.nextLine();
			nombres=nombres+nombre+"-";
			alumnos=alumnos+nombre+"-";
			//Leer el mail
			do {
				System.out.println("Introduzca el email");
				email=src.nextLine();
				k=-1;
				com=-1;
				es=-1;
				//Comprobar que @ esté en la posición 4 o superior y que no sea la primera
				k=email.indexOf("@");
				if(k>=4) {
					//Comprobar que hay un dominio como .com o .es
					com=email.indexOf(".com");
					es=email.indexOf(".es");
					if(com!=-1||es!=-1) {
						//Comprobar que el dominio viene despues del @
						if(com>k||es>k) {
							//Se cumplen todas las caracteristicas
							a=true;
						}
					}
				}
				//No se cumplen las condiciones
				if(k==-1) {
					System.out.println("ERROR: El mail tiene que tener el caracter @");
				}
				if(k==0) {
					System.out.println("ERROR: El mail no puede comenzar con el caracter @");
				}
				if(k<4) {
					System.out.println("ERROR: El mail necesita al menos 4 caracteres antes del @");
				}
				if(com==-1&&es==-1) {
					System.out.println("ERROR: El correo no tiene dominio .com ni .es");
				}else if(com<k&&es<k) {
					System.out.println("ERROR: La extensión tiene que venir despues del @");
				}
			}while(a==false);
			//Unir el email con el correspondiente alumno y guardar correos
			alumnos=alumnos+email+"_";
			correos=correos+email+"-";
			i=i+1;
		}while(i<n_alumnos);}
		//Separar a los alumnos con las barras bajas
		s_alumnosc=alumnos.split("_");
		//Imprimir por pantalla los datos del alumno
		System.out.println("Se han dado de alta los alumnos siguientes:");
		for(i=0;i<s_alumnosc.length;i++) {
			//Separar los datos individuales del alumno
			s_alumnosf=s_alumnosc[i].split("-");
			System.out.printf("%s: %s, email: %s\n",s_alumnosf[0],s_alumnosf[1],s_alumnosf[2]);
		}
		//Paso 3
		System.out.println("Paso 3: Matriculaciones");
		//Proceso de matriculacion
		s_NIAs=NIAs.split("-");
		s_nombres=nombres.split("-");
		s_correos=correos.split("-");
		do {
			System.out.println("Introduzca el nombre del alumno o salir");
			nombre=src.nextLine();
			//Comprobar si pide salir
			k=nombre.indexOf("salir");
			if(k!=-1) {
				//Hemos terminado de inscribir
				salir=true;
				break;
			}
			//Comprobar que el nombre existe
			k=nombres.indexOf(nombre);
			if(k!=-1) {
				//El alumno existe por lo que leemos la asignatura
				do {
					System.out.println("Introduzca la asignatura");
					prueba=src.nextLine();
					j=asignaturas.indexOf(prueba);
					if(j!=-1) {
						//La asignatura existe
						//Imprimir los resultados
						System.out.println("Se ha matriculado a "+nombre+" en "+prueba);
						//Guardar todos los datos en un resultado
						resultado=resultado+s_NIAs[k]+": "+s_nombres[k]+", email: "+s_correos[k]+separadas[j]+"-";
					}else {
						//La asignatura no existe
						System.out.println("ERROR: La asignatura seleccionada no existe");
					}
				}while(j==-1);
			}
		}while(salir==false);
		//Paso 4
		System.out.println("Paso 4: Resultado de la matricula:");
		//Separar las matriculas
		s_resultados=resultado.split("-");
		//Imprimir los resultados
		for(i=0;i<s_resultados.length;i++) {
			System.out.printf("%s\n",s_resultados[i]);
		}
		src.close();
	}
}
