package Lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		double value;
		Scanner input = new Scanner(System.in);

		System.out.println("1. Set Height.");
		System.out.println("2. Set Width.");
		System.out.println("3. See All values.");
		System.out.println("4. Exit.");
		System.out.print("Choice: ");

		choice = input.nextInt();
		Rectangle rectangle = new Rectangle();

		while (choice != 4) {
			System.out.println();

			if (choice == 1) {
				System.out.print("Enter height: ");
				value = input.nextDouble();
				rectangle.setHeight(value);
				System.out.println();
			}

			else if (choice == 2) {
				System.out.print("Enter width: ");
				value = input.nextDouble();
				rectangle.setWidth(value);
				System.out.println();
			}

			else if (choice == 3) {
				rectangle.printAll();
			}

			System.out.println("1. Set Height.");
			System.out.println("2. Set Width.");
			System.out.println("3. See All values.");
			System.out.println("4. Exit.");
			System.out.print("Choice: ");

			choice = input.nextInt();
		}

		input.close();
	}

}
