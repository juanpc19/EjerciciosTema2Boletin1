package ejerciciostema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		//double numeroIntroducido;
		
		String numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entre 0 y 99.999: ");
		
		numeroIntroducido = dogma.nextLine();
		
		if ((numeroIntroducido>0) && (numeroIntroducido<99.999)) {
			System.out.print("El numero introducido tiene" + numeroIntroducido.length() + " cifras ");
		} else {
			System.out.print("El numero introducido no esta en el intervalo solicitado");
		}
		
		
	}

}
