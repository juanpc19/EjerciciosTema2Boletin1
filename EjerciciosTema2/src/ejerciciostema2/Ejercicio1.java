package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numeroIntroducido, resto; //Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
			
		//Solicito un numero por consola al usuario
		System.out.print("Introduzca un numero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		/*Asigno un valor a la variable con uso del operador modulo 
		 * (asigna a resto el resto de la division de variable entre 2)*/
		resto = numeroIntroducido %2;
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if (resto==0) {
			System.out.print("El numero introducido es par");
			
		/*Establezco que de no cumplirse la condicion anterior se imprimira
		el siguiente mensaje por consola*/
		} else {
			System.out.print("El numero introducido es impar");
		}
		
		//Cierro el Scanner
		dogma.close();

	}

}
