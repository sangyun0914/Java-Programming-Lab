import java.util.Scanner;
import java.util.Random;

public class Homework1 {

    static int row, col, bomb;

    public static void main(String[] args) {
        int randx, randy;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number rows: ");
        row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        col = input.nextInt();
        System.out.print("Enter the number of bomb: ");
        bomb = input.nextInt();
        System.out.println("This is bomb map:");

        int[][] mines = new int[row][col];

        for (int i = 0; i < bomb; i++) { // Assign random bomb coordinates
            randx = rand.nextInt(row);
            randy = rand.nextInt(col);
            while (mines[randx][randy] == -1) {
                randx = rand.nextInt(row);
                randy = rand.nextInt(col);
            }
            mines[randx][randy] = -1;
        }

        for (int i = 0; i < row; i++) { // Assign non-bomb coordinate values
            for (int j = 0; j < col; j++) {
                if (mines[i][j] != -1)
                    mines[i][j] = findBomb(mines, i, j);
            }
        }

        for (int i = 0; i < row; i++) { // Print bomb map
            for (int j = 0; j < col; j++) {
                if (mines[i][j] == 0)
                    System.out.print("- ");
                else if (mines[i][j] == -1)
                    System.out.print("* ");
                else
                    System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }

        input.close();

    }

    public static int findBomb(int[][] mines, int randx, int randy) {
        int x[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int y[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int sum = 0, newx, newy;

        for (int i = 0; i < 8; i++) {
            newx = randx + x[i];
            newy = randy + y[i];
            if (newx >= 0 && newy >= 0 && newx < row && newy < col)
                if (mines[newx][newy] == -1)
                    sum++;
        }

        return sum;
    }

}
