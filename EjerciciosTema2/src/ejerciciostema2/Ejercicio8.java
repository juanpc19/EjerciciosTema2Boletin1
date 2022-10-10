package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double numero;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca un numero real: ");
		
		//Asigno a variable valor mediante uso de Scanner
		numero = dogma.nextDouble();
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if ((numero>=0) && (numero<5)) {
			System.out.print("INSUFICIENTE");
		
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/		
		} else if ((numero>=5) && (numero<6)) { 
			System.out.print("SUFICIENTE");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/	
		} else if ((numero>=6) && (numero<7)) {
			System.out.print("BIEN");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/	
		} else if ((numero>=7) && (numero<9)) {
			System.out.print("NOTABLE");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/	
		} else if ((numero>=9) && (numero<=10)) {
			System.out.print("SOBRESALIENTE");
			
		/*Establezco que de no cumplirse ninguna de las condiciones anteriores se imprimira
		el siguiente mensaje por consola*/	
		} else {
			System.out.print("El numero introducido no esta comprendido en el intervalo (0,10)");
		}
		
		//Cierro el Scanner
		dogma.close();
	
	}

}
