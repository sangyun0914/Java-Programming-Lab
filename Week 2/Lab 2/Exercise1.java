import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

	static int randomInt1, randomInt2, answer;

	public static void Generate() {
		Random random = new Random();
		randomInt1 = random.nextInt(10);
		randomInt2 = random.nextInt(10);
		answer = randomInt1 * randomInt2;
		System.out.printf("How much is %d times %d?\n", randomInt1, randomInt2);
		System.out.printf("Enter your answer (-1 to exit):");
	}

	public static void main(String[] args) {
		Generate();

		Scanner input = new Scanner(System.in);
		int i = input.nextInt();

		Random r = new Random();

		String[] correct = { "Very Good!", "Excellent!", "Nice work!" };
		String[] wrong = { "No. Please try again.", "No. Keep trying.", "Don't give up!" };

		while (i != -1) {
			int randomPhrase = r.nextInt(3);

			if (i == answer) {
				System.out.println(correct[randomPhrase]);
				Generate();
				i = input.nextInt();
			}

			else {
				System.out.println(wrong[randomPhrase]);
				System.out.printf("Enter your answer (-1 to exit):");
				i = input.nextInt();
			}
		}
		input.close();
	}
}
