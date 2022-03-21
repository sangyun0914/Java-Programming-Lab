package Lab5;

public class ShapeTester {
    public static void main(String[] args) {

        // create an object
        Circle cir1 = new Circle("Cir One", 3.0);
        Rectangle rec1 = new Rectangle("Rec One", 3.0, 4.0);
        Square sq1 = new Square("Square One", 6.0);

        System.out.println("Four shapes have been created:");
        // print the object properties
        System.out.println("1." + cir1.toString());
        System.out.printf("%s's area is %.2f, radius is %.2f, diameter is %.2f\n",
                cir1.getName(), cir1.getArea(), cir1.getRadius(), cir1.getDiameter());

        System.out.println("2." + rec1.toString());
        System.out.printf("%s's area is %.2f, width is %.2f, height is %.2f\n",
                rec1.getName(), rec1.getArea(), rec1.getWidth(),
                rec1.getHeight());

        System.out.println("3." + sq1.toString());
        System.out.printf("%s's area is %.2f, side is %.2f\n", sq1.getName(),
                sq1.getArea(), sq1.getSide());

        // print all circle shape
        System.out.printf("Is %s a TwoDimensionalShape? %s\n", sq1.getName(),
                sq1 instanceof TwoDimensionalShape);
        System.out.printf("Is %s a Rectangle? %s\n", sq1.getName(),
                sq1 instanceof Rectangle);
        System.out.printf("Is %s a Square? %s\n", sq1.getName(),
                sq1 instanceof Square);
    }
}