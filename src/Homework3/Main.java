package Homework3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int choice;

                System.out.println("Menu");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Sphere");
                System.out.println("4. Cube");
                System.out.println("5. Rectangular prism");
                System.out.println("6. Cylinder");
                System.out.println("7. Cone");
                System.out.println("8. Exit");
                System.out.print("Choice: ");

                choice = input.nextInt();

                while (choice != 8) {
                        String name;
                        input.nextLine();

                        if (choice == 1) {
                                double radius;

                                System.out.print("Enter name, radius: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                radius = Double.parseDouble(buff[1]);

                                Circle cir1 = new Circle(name, radius);
                                cir1.toString();
                                System.out.printf("%s's area is %.2f, radius is %.2f\n",
                                                cir1.getName(), cir1.getArea(), cir1.getRadius());
                        }

                        else if (choice == 2) {
                                double width, height;

                                System.out.print("Enter name, width, height: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                width = Double.parseDouble(buff[1]);
                                height = Double.parseDouble(buff[2]);

                                Rectangle rec1 = new Rectangle(name, width, height);
                                rec1.toString();
                                System.out.printf("%s's area is %.2f, width is %.2f, height is %.2f\n",
                                                rec1.getName(), rec1.getArea(), rec1.getWidth(), rec1.getHeight());
                        }

                        else if (choice == 3) {
                                double radius;

                                System.out.print("Enter name, radius: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                radius = Double.parseDouble(buff[1]);

                                Sphere sph1 = new Sphere(name, radius);
                                sph1.toString();
                                System.out.printf("%s's volume is %.2f, radius is %.2f\n",
                                                sph1.getName(), sph1.getVolume(), sph1.getRadius());
                        }

                        else if (choice == 4) {
                                double side;

                                System.out.print("Enter name, side: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                side = Double.parseDouble(buff[1]);

                                Cube cube1 = new Cube(name, side);
                                cube1.toString();
                                System.out.printf("%s's volume is %.2f, side is %.2f\n",
                                                cube1.getName(), cube1.getVolume(), cube1.getSide());

                        }

                        else if (choice == 5) {
                                double length, width, height;

                                System.out.print("Enter name, length, width, height: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                length = Double.parseDouble(buff[1]);
                                width = Double.parseDouble(buff[2]);
                                height = Double.parseDouble(buff[3]);

                                RectangularPrism prism1 = new RectangularPrism(name, length, width, height);
                                prism1.toString();
                                System.out.printf(
                                                "%s's volume is %.2f, length is %.2f, width is %.2f, height is %.2f\n",
                                                prism1.getName(), prism1.getVolume(), prism1.getLength(),
                                                prism1.getWidth(), prism1.getHeight());

                        }

                        else if (choice == 6) {
                                double radius, height;

                                System.out.print("Enter name, radius, height: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                radius = Double.parseDouble(buff[1]);
                                height = Double.parseDouble(buff[2]);

                                Cylinder cyl1 = new Cylinder(name, radius, height);
                                cyl1.toString();
                                System.out.printf("%s's volume is %.2f, radius is %.2f, height is %.2f\n",
                                                cyl1.getName(), cyl1.getVolume(), cyl1.getRadius(), cyl1.getHeight());
                        }

                        else if (choice == 7) {
                                double radius, height;

                                System.out.print("Enter name, radius, height: ");
                                String[] buff = input.nextLine().split(" ");
                                name = buff[0];
                                radius = Double.parseDouble(buff[1]);
                                height = Double.parseDouble(buff[2]);

                                Cone cone1 = new Cone(name, radius, height);
                                cone1.toString();
                                System.out.printf("%s's volume is %.2f, radius is %.2f, height is %.2f\n",
                                                cone1.getName(), cone1.getVolume(), cone1.getRadius(),
                                                cone1.getHeight());
                        }

                        System.out.println();
                        System.out.println("Menu");
                        System.out.println("1. Circle");
                        System.out.println("2. Rectangle");
                        System.out.println("3. Sphere");
                        System.out.println("4. Cube");
                        System.out.println("5. Rectangular prism");
                        System.out.println("6. Cylinder");
                        System.out.println("7. Cone");
                        System.out.println("8. Exit");
                        System.out.print("Choice: ");

                        choice = input.nextInt();
                }

                input.close();
        }
}
