package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double a, b, c, x;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario valor de a
		System.out.print("Introduzca valor de a: ");
		
		a = dogma.nextDouble();
		
		System.out.print("Introduzca valor de b: ");
		
		b = dogma.nextDouble();
		
		System.out.print("Introduzca valor de c: ");

		c = dogma.nextDouble();
		
		x = (-b + Math.sqrt(b*b-4*a*c)/2);
		//Si la raiz cuadrada es negativa no tiene solucion
		if (Math.sqrt(b*b-4*a*c)<0) {
			System.out.print("La ecuacion no tiene solucion");
		} else {
			System.out.print("La solucion de la ecuacion es: " + x);
		}
		
		dogma.close();
		
	}

}
