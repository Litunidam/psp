package primerosEjercicios;

import java.util.Scanner;

enum months {

	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
	OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	private final int days;

	private months(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}

}

public class Ejercicio5 {

	public static void main(String[] args) {

		String date1;
		String date2;
		Scanner s = new Scanner(System.in);
		String[] parts1 = new String[3];
		String[] parts2 = new String[3];
		int compare1;
		int compare2;
		int result;

		System.out.println("Introduzca la primera fecha: ");

		date1 = s.nextLine();

		System.out.println("Introduzca la segunda fecha: ");

		date2 = s.nextLine();

		try {

			parts1 = date1.split("/");

			parts2 = date2.split("/");

			if (isGoodDate(parts1) && isGoodDate(parts2)) {

				compare1 = Integer.parseInt(parts1[0])
						+ (daysAtMonth(Integer.parseInt(parts1[1])) + (Integer.parseInt(parts1[2]) * 365));

				compare2 = Integer.parseInt(parts2[0])
						+ (daysAtMonth(Integer.parseInt(parts2[1])) + (Integer.parseInt(parts2[2]) * 365));

				result = getDifference(compare1, compare2);

				result = getMinutes(result);

				System.out.println("La diferencia de minutos es: " + result);

			} else {
				System.out.println("Has introducido la misma fecha dos veces");
			}
			s.close();

		} catch (Exception e) {

			System.out.println(e);
			System.out.println("No se ha introducido un formato correcto");

		}

	}

	private static int getMinutes(int days) {
		return days * 1440;
	}

	private static int getDifference(int compare1, int compare2) {

		if (compare1 > compare2) {

			return compare1 - compare2;

		}

		return compare2 - compare1;

	}

	private static int daysAtMonth(int part) {

		switch (part) {

		case 1:

			return 0;

		case 02:

			return 31;

		case 3:

			return 59;

		case 4:

			return 0;

		case 5:
			return 120;

		case 6:

			return 151;

		case 7:

			return 181;

		case 8:

			return 212;

		case 9:

			return 243;

		case 10:

			return 273;

		case 11:

			return 304;

		case 12:

			return 334;

		}
		return -1;
	}

	private static boolean isGoodDate(String[] parts) {

		if (parts.length < 3 == false || parts.length > 3 == false) {

			if (Integer.parseInt(parts[0]) > 0 && Integer.parseInt(parts[0]) < 32 && Integer.parseInt(parts[1]) > 0
					&& Integer.parseInt(parts[1]) < 13 && Integer.parseInt(parts[2]) >= 0
					&& Integer.parseInt(parts[2]) < 10000) {

				switch (Integer.parseInt(parts[1])) {

				case 02:

					if (Integer.parseInt(parts[1]) > months.FEBRUARY.getDays()) {

						return false;
					}
					break;

				case 04:

					if (Integer.parseInt(parts[1]) > months.APRIL.getDays()) {

						return false;
					}
					break;
				case 06:
					if (Integer.parseInt(parts[1]) > months.JUNE.getDays()) {

						return false;
					}
					break;

				case 9:
					if (Integer.parseInt(parts[1]) > months.SEPTEMBER.getDays()) {

						return false;
					}
					break;

				case 11:

					if (Integer.parseInt(parts[1]) > months.NOVEMBER.getDays()) {

						return false;
					}
					break;

				default:
					return true;

				}

				return true;
			}

		}
		return false;
	}

}
