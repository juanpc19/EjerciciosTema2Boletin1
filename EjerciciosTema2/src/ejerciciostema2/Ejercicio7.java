package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// (0/9) (10/99) (100/999) (1000/9.999) (10000/99999)
		
		double numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entre 0 y 99.999: ");
		
		numeroIntroducido = dogma.nextDouble();
		
		if ((numeroIntroducido>=0) && (numeroIntroducido<=9)) {
			System.out.print("El numero introducido tiene 1 cifra");
		} else if ((numeroIntroducido>=10) && (numeroIntroducido<=99)) {
			System.out.print("El numero introducido tiene 2 cifras");
		} else if ((numeroIntroducido>=100) && (numeroIntroducido<=999)) {
			System.out.print("El numero introducido tiene 3 cifras");
		} else if ((numeroIntroducido>=1000) && (numeroIntroducido<=9999)) {
			System.out.print("El numero introducido tiene 4 cifras");
		} else if ((numeroIntroducido>=10000) && (numeroIntroducido<=99999)){
			System.out.print("El numero introducido tiene 5 cifras");
		} else { 
			System.out.print("El numero introducido no se encuentra en el intervalo solicitado (0/99.999");
		}
		
		dogma.close();
	}

}
