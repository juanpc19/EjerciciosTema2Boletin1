package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double numero1, numero2;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito el primer numero por consola al usuario
		System.out.print("Introduzca primer numero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		numero1 = dogma.nextDouble();
		
		//Solicito el segundo numero por consola al usuario
		System.out.print("Introduzca segundo numero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		numero2 = dogma.nextDouble();
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if (numero1>numero2) {
			System.out.print(numero2  + " y " + numero1);
		
		/*Establezco que de no cumplirse la condicion anterior se imprimira
		el siguiente mensaje por consola*/
		} else {System.out.print(numero1  + " y " + numero2);
		}
		
		//Cierro el Scanner
		dogma.close();

	}

}
