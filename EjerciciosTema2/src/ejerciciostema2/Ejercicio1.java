package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numeroIntroducido, resto;
		
		Scanner dogma = new Scanner(System.in);
			
		System.out.print("Introduzca un numero: ");
		
		numeroIntroducido = dogma.nextInt();
		
		resto = numeroIntroducido %2;
		
		if (resto==0) {
			System.out.print("El numero introducido es par");
		} else {
			System.out.print("El numero introducido es impar");
		}
		
		
		
		

	}

}
