package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int jugador1, jugador2;//Declaro las variables
		final int PIEDRA = 1; //Declaro la constante PIEDRA y le doy valor 1
		final int PAPEL = 2; //Declaro la constante PAPEL y le doy valor 2	
		final int TIJERAS = 3; //Declaro la constante TIJERAS y le doy valor 3
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Jugador 1 introduzca PIEDRA (1), PAPEL (2)  TIJERAS (3): ");
		
		//Asigno a variable valor mediante uso de Scanner
		jugador1 = dogma.nextInt();
		
		//Establezco la condicion que al cumplirse cualquiera de sus dos partes imprimira el siguiente mensaje por consola
		if (jugador1<1 || jugador1>3) {
			System.out.print("El valor introducido no es valido, use 1 2 o 3 ");
		}
		
		//Solicito a usuario valor de variable por consola
		System.out.print("Jugador 2 introduzca PIEDRA (1), PAPEL (2)  TIJERAS (3): ");
		
		//Asigno a variable valor mediante uso de Scanner
		jugador2 = dogma.nextInt();
		
		//Establezco la condicion que al cumplirse cualquiera de sus dos partes imprimira el siguiente mensaje por consola
		if (jugador2<1 || jugador2>3) {
			System.out.print("El valor introducido no es valido, use 1 2 o 3 ");
		}
		
		//Establezco la condicion que al cumplirse imprimira el siguiente mensaje por consola
		if (jugador1 == jugador2) {
			System.out.print("El resultado es empate");
		
		/*Establezco conjunto de condiciones a comprobar si la condicion anterior no se cumple,
		y de cumplirse cualquier condicion de este ultimo conjunto de condiciones imprimira el siguiente mensaje por consola*/
		} else if (((jugador1==PAPEL) && ( jugador2==PIEDRA)) 
				|| ((jugador1==PIEDRA && jugador2==TIJERAS)) 
				|| ((jugador1==TIJERAS && jugador2==PAPEL))) {
			System.out.print("Jugador1 gana");
			
		/*Establezco que de no cumplirse ninguna de las condiciones anteriores se imprimira
		el siguiente mensaje por consola*/
		} else {
			System.out.print("Jugador2 gana");
		}

		//Cierro el Scanner
		dogma.close();

	}

}
