package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int primerNumero, segundoNumero ;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito un numero entero por consola al usuario
		System.out.print("Introduzca un numero entero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		primerNumero = dogma.nextInt();
		
		//Solicito un numero entero por consola al usuario
		System.out.print("Introduzca otro numero entero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		segundoNumero = dogma.nextInt();
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if (primerNumero == segundoNumero) {
			System.out.print("Los numeros introducidos son iguales ");
			
		/*Establezco que de no cumplirse la condicion anterior se imprimira
		el siguiente mensaje por consola*/
		} else {
			System.out.print("Los numeros introducidos no son iguales ");
		}
		
		//Cierro el Scanner
		dogma.close();

	}

}
