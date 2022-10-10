package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double numero1, numero2, numero3;//Declaro las variables
		
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
		
		//Solicito el tercer numero por consola al usuario
		System.out.print("Introduzca tercer numero: ");
		
		//Asigno un valor a la variable mediante uso del Scanner
		numero3 = dogma.nextDouble();
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if (numero1>numero2 && numero2>numero3) {
			System.out.print(numero1 + " , " + numero2 + " , " + numero3);
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if (numero1>numero3 && numero3>numero2) {
			System.out.print(numero1 + " , " + numero3 + " , " + numero2);
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if (numero2>numero1 && numero1>numero3) {
			System.out.print(numero2 + " , " + numero1 + " , " + numero3);
		
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if (numero2>numero3 && numero3>numero1) {
			System.out.print(numero2 + " , " + numero3 + " , " + numero1);
		
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if (numero3>numero1 && numero1>numero2) {
			System.out.print(numero3 + " , " + numero1 + " , " + numero2);
			
		/*Establezco que else imprima por pantalla el siguiente mensaje
		de no cumplirse ninguna de las condiciones anteriores*/
		} else {
			System.out.print(numero3 + " , " + numero2 + " , " + numero1);
		}

		//Cierro Scanner
		dogma.close();
		
	}

}
