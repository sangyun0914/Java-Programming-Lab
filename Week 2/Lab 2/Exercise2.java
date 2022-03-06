import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Formatter;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Formatter fmt = new Formatter();

		System.out.print("Enter number of dices: ");
		int n = input.nextInt();
		System.out.print("Enter number of rolls: ");
		int k = input.nextInt();

		int[] sumArray = new int[5 * n + 1];
		Arrays.fill(sumArray, 0);

		for (int i = 0; i < k; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += random.nextInt(6) + 1;
			}
			sumArray[sum - n]++;
		}

		fmt.format("%2s %15s %15s\n", "Sum", "Frequency", "Percentage");

		for (int i = n; i <= 6 * n; i++) {
			String percentage = String.format("%.2f", ((float) sumArray[i - n] / k) * 100);
			fmt.format("%2s %15s %15s\n", i, sumArray[i - n], percentage);
		}
		System.out.println(fmt);

		input.close();
		fmt.close();
	}

}
