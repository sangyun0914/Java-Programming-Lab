package Lab1;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ".");

        input.close();
    }

}
