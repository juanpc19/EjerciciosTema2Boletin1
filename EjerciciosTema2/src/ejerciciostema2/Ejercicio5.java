package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double numero1, numero2, numero3;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca primer numero: ");
		
		numero1 = dogma.nextDouble();
		
		System.out.print("Introduzca segundo numero: ");
		
		numero2 = dogma.nextDouble();
		
		System.out.print("Introduzca tercer numero: ");
		
		numero3 = dogma.nextDouble();
		
		/* 1>2>3	1>3>2
		 * 2>1>3 	2>3>1
		 * 3>1>2	3>2>1	
		*/
		
		if (numero1>numero2 && numero2>numero3) {
			System.out.print(numero1 + " , " + numero2 + " , " + numero3);
			
		} else if (numero1>numero3 && numero3>numero2) {
			System.out.print(numero1 + " , " + numero3 + " , " + numero2);
			
		} else if (numero2>numero1 && numero1>numero3) {
			System.out.print(numero2 + " , " + numero1 + " , " + numero3);
			
		} else if (numero2>numero3 && numero3>numero1) {
			System.out.print(numero2 + " , " + numero3 + " , " + numero1);
			
		} else if (numero3>numero1 && numero1>numero2) {
			System.out.print(numero3 + " , " + numero1 + " , " + numero2);
		//else aqui ejecuta la otra opcion restante (sin condicion porque ya la usa en el if anterior)	
		} else {
			System.out.print(numero3 + " , " + numero2 + " , " + numero1);
		}

		dogma.close();
		
	}

}
