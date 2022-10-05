package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int primerNumero, segundoNumero ;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero: ");
		
		primerNumero = dogma.nextInt();
		
		System.out.print("Introduzca otro numero entero: ");
		segundoNumero = dogma.nextInt();
		
		if (primerNumero == segundoNumero) {
			System.out.print("Los numeros introducidos son iguales ");
		} else {
			System.out.print("Los numeros introducidos no son iguales ");
		}
		
		dogma.close();

	}

}
