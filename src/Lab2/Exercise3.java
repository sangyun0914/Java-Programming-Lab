package Lab2;

public class Exercise3 {
    public static void main(String[] args) {
        float x;
        System.out.println("x is x");
        x = 15.2f; // set x to 15.2
        System.out.println("x is now " + x);
        int[] array = new int[10];
        for (int i = 1; i <= 10; i++) {
            array[i - 1] = (int) x + i;
        }
        System.out.println("First and last number of array are:" + array[0] + " and " + array[9]);
    }
}