package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		double numeroDecimal;

		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero decimal: ");
		
		numeroDecimal = dogma.nextDouble();
		
		if ((numeroDecimal !=0) && (numeroDecimal<1) && (numeroDecimal>-1)) {
			System.out.print("Es un numero casi 0");
		} else {System.out.print("No es un numero casi 0");
		}
		
		dogma.close();
	}

}
