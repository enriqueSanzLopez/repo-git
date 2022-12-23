package mapa_aleat;
import java.util.*;
public class Principal {
	private static final int ANCHO = 20;
	private static final int ALTO = 10;
	public static void main(String arg[]) {
		Random r=new Random();
		int[][] mapa=new int[ALTO][ANCHO];
		llenaMapa(r, mapa);
		pintaMapa(mapa);
	}
	private static void pintaMapa(int[][] mapa) {
		for(int i=0;i<ALTO;i++) {
			for(int j=0;j<ANCHO;j++) {
				System.out.print(mapa[i][j]);
			}
			System.out.println();
		}
	}
	@SuppressWarnings("unused")
	private static void llenaMapa(Random r, int[][] mapa) {
		int max=ANCHO;
		if(ANCHO<ALTO) {
			max=ALTO;
		}
		for(int i=0;i<ALTO;i++) {
			for(int j=0;j<ANCHO;j++) {
				int resultado=(int)(r.nextDouble()*(max+1)+0);
				if(i<ALTO/2&&j<ANCHO/2) {//Cuadrante 1
					if(resultado>i&&resultado>j) {
						mapa[i][j]=0;
					}else if(resultado>i||resultado>j){
						mapa[i][j]=1;
					}else if(resultado==i||resultado==j) {
						mapa[i][j]=2;
					}else {
						mapa[i][j]=3;
					}
				}else if(i<ALTO/2&&j>ANCHO/2) {//Cuadrante 2
					if(resultado>i&&resultado<j) {
						mapa[i][j]=0;
					}else if(resultado>i||resultado<j){
						mapa[i][j]=1;
					}else if(resultado==i||resultado==j) {
						mapa[i][j]=2;
					}else {
						mapa[i][j]=3;
					}
				}else if(i>ALTO/2&&j<ANCHO/2) {//Cuandrante 3
					if(resultado<i&&resultado>j) {
						mapa[i][j]=0;
					}else if(resultado<i||resultado>j){
						mapa[i][j]=1;
					}else if(resultado==i||resultado==j) {
						mapa[i][j]=2;
					}else {
						mapa[i][j]=3;
					}
				}else {//Cuadrante 4
					if(resultado<i&&resultado<j) {
						mapa[i][j]=0;
					}else if(resultado<i||resultado<j){
						mapa[i][j]=1;
					}else if(resultado==i||resultado==j) {
						mapa[i][j]=2;
					}else {
						mapa[i][j]=3;
					}
				}
			}
		}
	}
}