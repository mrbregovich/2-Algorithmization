package by.mrbregovich.helperPackage;

import java.util.Scanner;

/*
 * Для получения значений от пользователя
 */
public class UserInputHelper {

	private Scanner scan;

	public UserInputHelper() {
		scan = new Scanner(System.in);
	}

	public double getDoubleValue(String message) {
		System.out.print(message);
		while (!scan.hasNextDouble()) {
			scan.next();
			System.out.print(message);
		}
		return scan.nextDouble();
	}

	public int getIntValue(String message) {
		System.out.print(message);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}
		return scan.nextInt();
	}

	public long getLongValue(String message) {
		System.out.print(message);
		while (!scan.hasNextLong()) {
			scan.next();
			System.out.print(message);
		}
		return scan.nextLong();
	}

}