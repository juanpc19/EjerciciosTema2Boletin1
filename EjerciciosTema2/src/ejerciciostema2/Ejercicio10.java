package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero1, numero2, numero3;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca primer numero entero: ");
		
		numero1 = dogma.nextInt();
		
		System.out.print("Introduzca segundo numero entero: ");
		
		numero2 = dogma.nextInt();
		
		System.out.print("Introduzca tercer numero entero: ");
		
		numero3 = dogma.nextInt();
		
		if ((numero1+numero2==numero3) || (numero1+numero3==numero2) || (numero3+numero2==numero1)) {
			System.out.print("La suma de dos de esos números da como resultado el otro número");
		} else {
			System.out.print("La suma de dos de esos números NO da como resultado el otro número");
		}

		dogma.close();
	 	
	}

}
