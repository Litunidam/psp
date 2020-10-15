package primerosEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static double roundDecimal(double part) {
		double leftPart = Math.floor(part); 
		part = (part-leftPart)*Math.pow(10, 2);
		part = Math.round(part);
		part = (part/Math.pow(10, 2))+leftPart;
		return part;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double price;
		double count = 0;
		int aux;

		double change[][] = new double[9][2];

		change[0][0] = (0.01);
		change[0][1] = 20;

		change[1][0] = (0.02);
		change[1][1] = 40;

		change[2][0] = (0.05);
		change[2][1] = 40;

		change[3][0] = (0.10);
		change[3][1] = 20;

		change[4][0] = (0.20);
		change[4][1] = 20;

		change[5][0] = (0.50);
		change[5][1] = 10;

		change[6][0] = (10);
		change[6][1] = 5;

		change[7][0] = (20);
		change[7][1] = 5;

		change[8][0] = (50);
		change[8][1] = 2;

		for (int i = 0; i < 3; i++) {

			System.out.println("Tiene que pagar:");
			price = s.nextDouble();
			s.nextLine();

			System.out.println("¿Cuántas monedas de 1 céntimo introdujo?");
			aux = s.nextInt();
			change[0][1] = change[0][1] + aux;
			s.nextLine();
			count = count + (change[0][0] * aux);

			System.out.println("¿Cuántas monedas de 2 céntimos introdujo?");
			aux = s.nextInt();
			change[1][1] = change[1][1] + aux;
			s.nextLine();
			count = count + (change[1][0] * aux);

			System.out.println("¿Cuántas monedas de 5 céntimos introdujo?");
			aux = s.nextInt();
			change[2][1] = change[2][1] + aux;
			s.nextLine();
			count = count + (change[2][0] * aux);

			System.out.println("¿Cuántas monedas de 10 céntimos introdujo?");
			aux = s.nextInt();
			change[3][1] = change[3][1] + aux;
			s.nextLine();
			count = count + (change[3][0] * aux);

			System.out.println("¿Cuántas monedas de 20 céntimos introdujo?");
			aux = s.nextInt();
			change[4][1] = change[4][1] + aux;
			s.nextLine();
			count = count + (change[4][0] * aux);

			System.out.println("¿Cuántas monedas de 50 céntimos introdujo?");
			aux = s.nextInt();
			change[5][1] = change[5][1] + aux;
			s.nextLine();
			count = count + (change[5][0] * aux);

			System.out.println("¿Cuántos billetes de 10 euros introdujo?");
			aux = s.nextInt();
			change[6][1] = change[6][1] + aux;
			s.nextLine();
			count = count + (change[6][0] * aux);

			System.out.println("¿Cuántos billetes de 20 euros introdujo?");
			aux = s.nextInt();
			change[7][1] = change[7][1] + aux;
			s.nextLine();
			count = count + (change[7][0] * aux);

			System.out.println("¿Cuántos billetes de 50 euros introdujo?");
			aux = s.nextInt();
			change[8][1] = change[8][1] + aux;
			s.nextLine();
			count = count + (change[8][0] * aux);

			if (count > price) {

				count = count - price;
				System.out.println("Sus vueltas son: " + count + " euros");

				while (count > 0.0) {

					if (change[8][0] <= count && change[8][1] > 0) {

						change[8][1] -= 1;
						count -= change[8][0];
						count = roundDecimal(count);

					} else if (change[7][0] <= count && change[7][1] > 0) {

						change[7][1] -= 1;
						count -= change[7][0];
						count = roundDecimal(count);

					} else if (change[6][0] <= count && change[6][1] > 0) {

						change[6][1] -= 1;
						count -= change[6][0];
						count = roundDecimal(count);

					} else if (change[5][0] <= count && change[5][1] > 0) {

						change[5][1] -= 1;
						count -= change[5][0];
						count = roundDecimal(count);

					} else if (change[4][0] <= count && change[4][1] > 0) {

						change[4][1] -= -1;
						count -= change[4][0];
						count = roundDecimal(count);

					} else if (change[3][0] <= count && change[3][1] > 0) {

						change[3][1] -= 1;
						count -= change[3][0];
						count = roundDecimal(count);

					} else if (change[2][0] <= count && change[2][1] > 0) {

						change[2][1] -= -1;
						count -= change[2][0];
						count = roundDecimal(count);

					} else if (change[1][0] <= count && change[1][1] > 0) {

						change[1][1] -= 1;
						count -= change[1][0];
						count = roundDecimal(count);

					} else if (change[0][0] <= count && change[0][1] > 0) {

						change[0][1] -= 1;
						count -= change[0][0];
						count = roundDecimal(count);

					} else if (change[0][0] <= count && change[0][1] == 0) {

						System.out.println("Tiene que pagar con tarjeta");
					}

				}

			} else if (count < price) {
				System.out.println("Ha introducido mal el dinero.");

			} else if (count == price) {

				System.out.println("Ha introducido el importe exacto.");

			}

		}

	}
	
}
