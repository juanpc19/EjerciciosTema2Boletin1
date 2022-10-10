package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double a, b, c, x;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca valor de a: ");
		
		//Asigno a variable valor mediante uso de Scanner
		a = dogma.nextDouble();
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca valor de b: ");
		
		//Asigno a variable valor mediante uso de Scanner
		b = dogma.nextDouble();
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca valor de c: ");
		
		//Asigno a variable valor mediante uso de Scanner
		c = dogma.nextDouble();
		
		//Asigno valor a variable x mediante formula ecuacion segundo grado
		x = (-b + Math.sqrt(b*b-4*a*c)/2);
		
		//Si la raiz cuadrada es negativa no tiene solucion y lo muestro mediante mensaje impreso por consola	
		if (Math.sqrt(b*b-4*a*c)<0) {
			System.out.print("La ecuacion no tiene solucion");
			
		//Si la raiz cuadrada es positiva muestro el resultado de la ecuacion mediante mensaje impreso en consola
		} else {
			System.out.print("La solucion de la ecuacion es: " + x);
		}
		
		//Cierro el Scanner
		dogma.close();
		
	}

}
