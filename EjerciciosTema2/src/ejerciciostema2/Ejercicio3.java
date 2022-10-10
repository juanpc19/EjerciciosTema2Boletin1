package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		double numeroDecimal;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito un numero decimal por consola al usuario
		System.out.print("Introduzca un numero decimal: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		numeroDecimal = dogma.nextDouble();
		
		//Establezco que al cumplirse las 3 condiciones se imprimira el siguiente mensaje por consola
		if ((numeroDecimal !=0) && (numeroDecimal<1) && (numeroDecimal>-1)) {
			System.out.print("Es un numero casi 0");
			
		/*Establezco que de no cumplirse 1 de las 3 las condiciones anteriores se imprimira
		el siguiente mensaje por consola*/
		} else {System.out.print("No es un numero casi 0");
		}
		
		//Cierro el Scanner
		dogma.close();
	}

}
