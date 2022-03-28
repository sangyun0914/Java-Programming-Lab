package Lab6;

public class ShapeTester {
        public static void main(String[] args) {

                // create an object
                Circle cir1 = new Circle("Cir One", 3.0);
                Rectangle rec1 = new Rectangle("Rec One", 3.0, 4.0);

                System.out.println("Four shapes have been created:");

                // print the object properties
                System.out.println("1." + cir1);
                System.out.printf("%s's area is %.2f, radius is %.2f\n",
                                cir1.getName(), cir1.getArea(), cir1.getRadius());
                cir1.resize(0.8);
                System.out.printf("%s's area after resize is %.2f, radius after resize is %.2f\n",
                                cir1.getName(), cir1.getArea(), cir1.getRadius());

                System.out.println("2." + rec1);
                System.out.printf("%s's area is %.2f, width is %.2f, height is %.2f\n",
                                rec1.getName(), rec1.getArea(), rec1.getWidth(), rec1.getHeight());
                rec1.resize(0.4);
                System.out.printf("%s's area after resize is %.2f, width is %.2f, height after resize is %.2f\n",
                                rec1.getName(), rec1.getArea(), rec1.getWidth(), rec1.getHeight());

                if (cir1.compareTo(rec1) == 1) {
                        System.out.println(cir1.getName() + " is larger than " +
                                        rec1.getName());
                } else if (cir1.compareTo(rec1) == 0) {
                        System.out.println(cir1.getName() + " and " + rec1.getName()
                                        + " is same.");
                } else {
                        System.out.println(cir1.getName() + " is smaller than " +
                                        rec1.getName());
                }
        }
}