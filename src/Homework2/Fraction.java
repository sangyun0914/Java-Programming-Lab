package Homework2;

public class Fraction {
    private int numerator;
    private int denominator;

    /*
     * Default Constructor
     */
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /*
     * Two Argument Constructor
     * 
     * @param numerator
     * 
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        if (numerator < 0 && denominator < 0) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        } else if (denominator < 0 && numerator > 0) {
            numerator = -numerator;
            denominator = Math.abs(denominator);
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduceFrac();
    }

    /*
     * Adds two Fraction values
     * 
     * @param fraction Another Fraction to be added
     * 
     * @return newFrac New Fraction object by adding the parameter
     */
    public Fraction add(Fraction fraction) {
        int LCM = LCM(this.denominator, fraction.denominator);
        Fraction newFrac = new Fraction(this.numerator * (LCM / this.denominator)
                + fraction.numerator * (LCM / fraction.denominator), LCM);
        return newFrac;
    }

    /*
     * Subtracts two Fraction values
     * 
     * @param fraction Another Fraction to be subtracted
     * 
     * @return newFrac New Fraction object by subtracting the parameter
     */
    public Fraction subtract(Fraction fraction) {
        int LCM = LCM(this.denominator, fraction.denominator);
        Fraction newFrac = new Fraction(this.numerator * (LCM / this.denominator)
                - fraction.numerator * (LCM / fraction.denominator), LCM);
        return newFrac;
    }

    /*
     * Multiplies two Fraction values
     * 
     * @param fraction Another Fraction to be multiplied
     * 
     * @return newFrac New Fraction object by multiplying parameter
     */
    public Fraction multiply(Fraction fraction) {
        int numerator = this.numerator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;
        Fraction newFrac = new Fraction(numerator, denominator);
        return newFrac;
    }

    /*
     * Divdes two Fraction values
     * 
     * @param fraction Another Fraction to be divisor
     * 
     * @return newFrac New Fraction object by dividing by parameter
     */
    public Fraction divide(Fraction fraction) {
        int numerator = this.numerator * fraction.denominator;
        int denominator = this.denominator * fraction.numerator;
        Fraction newFrac = new Fraction(numerator, denominator);
        return newFrac;
    }

    /*
     * Prints current Fraction
     */
    public void print() {
        if (this.numerator == 0)
            System.out.println("0");
        else if (this.denominator == 1)
            System.out.println(this.numerator);
        else
            System.out.println(this.numerator + "/" + this.denominator);
    }

    /*
     * @return Fraction's numerator
     */
    public int getNumerator() {
        return this.numerator;
    }

    /*
     * Reduces Fraction by calling GCD method
     */
    private void reduceFrac() {
        int GCD = GCD(Math.abs(this.numerator), Math.abs(this.denominator));
        if (GCD != 1) {
            this.numerator = this.numerator / GCD;
            this.denominator = this.denominator / GCD;
        }
    }

    /*
     * Finds Greatest Common Divisor Euclidean Algorithm
     * 
     * @param num1
     * 
     * @param num2
     * 
     * @return num1
     */
    private static int GCD(int num1, int num2) {
        if (num2 > num1) // Swaps if num2 is greater than num1
            num1 = num1 ^ num2 ^ (num2 = num1);
        int num3 = 0;
        while (num2 > 0) {
            num3 = num1 % num2;
            num1 = num2;
            num2 = num3;
        }
        return num1;
    }

    /*
     * Finds Least Common Multiple
     * 
     * @param num1
     * 
     * @param num2
     * 
     * @return num1 * num2 / GCD LCM
     */
    private static int LCM(int num1, int num2) {
        int GCD = GCD(num1, num2);
        return num1 * num2 / GCD;
    }
}
