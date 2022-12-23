package Entornos;
import java.util.Scanner;
public class loops1 {
    public static void main(String[] args){
    	//Equivalente a Scanner
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sca=new Scanner(System.in);
        //Leer el valor del que sacar la tabla de multiplicar
        //int N = Integer.parseInt(bufferedReader.readLine().trim());
        int N=sca.nextInt();
        for(int i=1;i<=10;i++)
        {
        	System.out.println(N+" x "+i+" = "+(N*i));
        }
        sca.close();
        //bufferedReader.close();
    }
}