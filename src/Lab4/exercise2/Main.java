package Lab4.exercise2;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();

        System.out.print("Character1 HP, AP: ");
        int HP = scanner.nextInt();
        int AP = scanner.nextInt();
        Character Character1 = new Character(HP, AP);

        System.out.println("Menu");
        System.out.println("1. Add weapons");
        System.out.println("2. Exit");
        System.out.print("Choice: ");

        int input = scanner.nextInt();

        while (input != 2) {
            if (input == 1) {
                if (Character1.getWeapon() == 3) {
                    System.out.println("Can't add weapons anymore");
                    break;
                }
                System.out.print("Weapon's damage, durability: ");
                int dmg = scanner.nextInt();
                int dur = scanner.nextInt();
                Weapon weapon = new Weapon(dmg, dur);
                Character1.addWeapon(weapon);
            }
            System.out.println("Menu");
            System.out.println("1. Add weapons");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            input = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Character2 HP, AP: ");
        HP = scanner.nextInt();
        AP = scanner.nextInt();
        Character Character2 = new Character(HP, AP);

        System.out.println("Menu");
        System.out.println("1. Add weapons");
        System.out.println("2. Exit");
        System.out.print("Choice: ");

        input = scanner.nextInt();

        while (input != 2) {
            if (input == 1) {
                if (Character2.getWeapon() == 3) {
                    System.out.println("Can't add weapons anymore");
                    break;
                }
                System.out.print("Weapon's damage, durability: ");
                int dmg = scanner.nextInt();
                int dur = scanner.nextInt();
                Weapon weapon = new Weapon(dmg, dur);
                Character2.addWeapon(weapon);
            }
            System.out.println("Menu");
            System.out.println("1. Add weapons");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            input = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Fight!!");

        while (Character1.getHp() > 0 && Character2.getHp() > 0) {
            int Character = Random.nextInt(2) + 1;

            if (Character == 1) {
                System.out.println("Character1 attack.");
                int damage = Character1.getAttack();
                Character2.setHp(damage);
                System.out.println("Character2 has " + damage + " damage");
            }

            else if (Character == 2) {
                System.out.println("Character2 attack.");
                int damage = Character2.getAttack();
                Character1.setHp(damage);
                System.out.println("Character1 has " + damage + " damage");
            }

            System.out.println("Character1 (" + Character1.getHp() + ") : Character2 ("
                    + Character2.getHp() + ")");
            System.out.println();

        }
        if (Character1.getHp() > 0)
            System.out.println("Character1 win!!");
        else
            System.out.println("Character2 win!!");

        scanner.close();
    }

}
