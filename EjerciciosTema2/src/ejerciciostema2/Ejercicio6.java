package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double a, b, c;
		double x1, x2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca valor de a: ");
		
		a = dogma.nextDouble();
		
		System.out.print("Introduzca valor de b: ");
		
		b = dogma.nextDouble();
		
		System.out.print("Introduzca valor de c: ");

		c = dogma.nextDouble();
		
		x1 = (-b + Math.sqrt(b*b-4*a*c)/2);
	
		x2 = (-b - Math.sqrt(b*b-4*a*c)/2);
		
		// if
		System.out.print(x2);
		
	}

}
