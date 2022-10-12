package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double numeroIntroducido;//Declaro las variables
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
			
		//Solicito a usuario valor de variable por consola
		System.out.print("Introduzca un numero entre 0 y 99.999: ");
		
		//Asigno a variable valor mediante uso de Scanner
		numeroIntroducido = dogma.nextDouble();
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if ((numeroIntroducido>=0) && (numeroIntroducido<=9)) {
			System.out.print("El numero introducido tiene 1 cifra");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/	
		} else if ((numeroIntroducido>=10) && (numeroIntroducido<=99)) {
			System.out.print("El numero introducido tiene 2 cifras");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if ((numeroIntroducido>=100) && (numeroIntroducido<=999)) {
			System.out.print("El numero introducido tiene 3 cifras");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if ((numeroIntroducido>=1000) && (numeroIntroducido<=9999)) {
			System.out.print("El numero introducido tiene 4 cifras");
			
		/*Establezco la siguiente condicion a comprobar si la anterior no se cumple,
		y de cumplirse esta ultima imprimira el siguiente mensaje por consola*/
		} else if ((numeroIntroducido>=10000) && (numeroIntroducido<=99999)){
			System.out.print("El numero introducido tiene 5 cifras");
			
		/*Establezco que de no cumplirse ninguna de las condiciones anteriores se imprimira
		el siguiente mensaje por consola*/
		} else { 
			System.out.print("El numero introducido no se encuentra en el intervalo solicitado (0/99.999)");
		}
		
		//Cierro el Scanner
		dogma.close();
	}

}
