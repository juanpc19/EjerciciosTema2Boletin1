package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double numero;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero real: ");
		
		numero = dogma.nextDouble();
		
		if ((numero>=0) && (numero<5)) {
			System.out.print("INSUFICIENTE");
		} else if ((numero>=5) && (numero<6)) { 
			System.out.print("SUFICIENTE");
		} else if ((numero>=6) && (numero<7)) {
			System.out.print("BIEN");
		} else if ((numero>=7) && (numero<9)) {
			System.out.print("NOTABLE");
		/*Dejar solo el else sin condicion si se sobre entiende que 
		9, 10 y mayor numero es sobresaliente */
		} else if ((numero>=9) && (numero<=10)) {
			System.out.print("SOBRESALIENTE");
		//Borrar este ultimo else si no es necesario mensaje de error al introducir el numero real
		} else {
			System.out.print("El numero introducido no esta comprendido en el intervalo (0,10)");
		}
		
		dogma.close();
	
	}

}
