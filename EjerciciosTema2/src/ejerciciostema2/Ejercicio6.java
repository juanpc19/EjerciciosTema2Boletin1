package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int a, b, c;
		double x;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca valor de a: ");
		
		a = dogma.nextInt();
		
		System.out.print("Introduzca valor de b: ");
		
		b = dogma.nextInt();
		
		System.out.print("Introduzca valor de c: ");

		c = dogma.nextInt();
		
		x = - (b + Math.sqrt(b*b-4*a*c)/2);
	
		
		
	}

}
