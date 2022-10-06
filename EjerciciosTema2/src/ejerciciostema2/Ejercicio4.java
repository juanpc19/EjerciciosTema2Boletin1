package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		double numero1, numero2;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca primer numero: ");
		
		numero1 = dogma.nextDouble();
		
		System.out.print("Introduzca segundo numero: ");
		
		numero2 = dogma.nextDouble();
		
		if (numero1>numero2) {
			System.out.print(numero2  + " y " + numero1);
		} else {System.out.print(numero1  + " y " + numero2);
		}
		
		dogma.close();

	}

}
