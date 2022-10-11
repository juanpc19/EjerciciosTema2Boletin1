package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double a, b, c, x1, x2, raiz;//Declaro las variables
		
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
		
		//Asigno valor a raiz manualmente con su correspondiente parte de la formula de la ecuacion de segundo grado
		raiz = Math.sqrt(b*b-4*a*c);
		
		//Asigno valor a variable x1 y x2 mediante la formula de la ecuacion de segundo grado
		x1 = (-b + raiz/2);
		x2 = (-b - raiz/2);
		
		//Si la raiz cuadrada es negativa no tiene solucion y lo muestro mediante mensaje impreso por consola	
		if (raiz<0) {
			System.out.print("La ecuacion no tiene solucion");
			
		//Si la raiz cuadrada es positiva muestro los resultados de la ecuacion mediante mensaje impreso en consola
		} else {
			System.out.print("La primera solucion de la ecuacion es: " + x1 + "\nY la segunda solucion de la ecuacion es: " +x2);
		}
		
		//Cierro el Scanner
		dogma.close();
		
	}

}
