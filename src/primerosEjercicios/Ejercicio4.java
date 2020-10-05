package primerosEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		String date;
		Scanner s = new Scanner(System.in);
		boolean goodForm = false;
		String[] parts = new String[3];
		System.out.println("Introduzca una fecha en formato válido(dd/mm/aaaa) para validarla");
		date = s.nextLine();

		try {
			parts = date.split("/");

			if (parts.length < 3 || parts.length > 3) {
				if (Integer.parseInt(parts[0]) > 0 && Integer.parseInt(parts[0]) < 32 && Integer.parseInt(parts[1]) > 0
						&& Integer.parseInt(parts[1]) < 13 && Integer.parseInt(parts[2]) >= 0
						&& Integer.parseInt(parts[2]) < 10000) {
					goodForm = true;
				}

			} else {
				goodForm = false;
			}

			if (goodForm == true) {
				System.out.println("¡El formato de la fecha es correcto!");
			} else {
				System.out.println("El formato no es correcto");
			}

		} catch (Exception e) {

			System.out.println("No se ha introducido un formato correcto");

		}
	}

}
