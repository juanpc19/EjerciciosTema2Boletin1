package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero1, numero2, numero3;//Declaro las variables
		
		//Creo el Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca primer numero entero: ");
		
		//Asigno a variable valor mediante uso de Scanner
		numero1 = dogma.nextInt();
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca segundo numero entero: ");
		
		//Asigno a variable valor mediante uso de Scanner
		numero2 = dogma.nextInt();
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca tercer numero entero: ");
		
		//Asigno a variable valor mediante uso de Scanner
		numero3 = dogma.nextInt();
		
		//Establezco la condicion que al cumplirse cualquiera de sus tres partes imprimira el siguiente mensaje por consola
		if ((numero1+numero2==numero3) || (numero1+numero3==numero2) || (numero3+numero2==numero1)) {
			System.out.print("La suma de dos de esos números da como resultado el otro número");
			
		/*Establezco que de no cumplirse ninguna de las condiciones anteriores se imprimira
		el siguiente mensaje por consola*/
		} else {
			System.out.print("La suma de dos de esos números NO da como resultado el otro número");
		}

		//Cierro el Scanner
		dogma.close();
	 	
	}

}
