package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int jugador1, jugador2;
		final int PIEDRA = 1; 
		final int PAPEL = 2; 	
		final int TIJERAS = 3; 
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Jugador 1 introduzca PIEDRA (1), PAPEL (2)  TIJERAS (3): ");
		jugador1 = dogma.nextInt();
		if (jugador1<1 || jugador1>3) {
			System.out.print("El valor introducido no es valido, use 1 2 o 3 ");
		}
		System.out.print("Jugador 2 introduzca PIEDRA (1), PAPEL (2)  TIJERAS (3): ");
		jugador2 = dogma.nextInt();
		if (jugador2<1 || jugador2>3) {
			System.out.print("El valor introducido no es valido, use 1 2 o 3 ");
		}
		if (jugador1 == jugador2) {
			System.out.print("El resultado es empate");
		} else if (((jugador1==PAPEL) && ( jugador2==PIEDRA)) 
				|| ((jugador1==PIEDRA && jugador2==TIJERAS)) 
				|| ((jugador1==TIJERAS && jugador2==PAPEL))) {
			System.out.print("Jugador1 gana");
		} else {
			System.out.print("Jugador2 gana");
		}

		dogma.close();

	}

}
