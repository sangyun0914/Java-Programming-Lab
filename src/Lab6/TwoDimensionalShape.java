package Lab6;

public abstract class TwoDimensionalShape implements Resizable {
    private static final String CLASS_NAME = "2D Shape";
    private String name;
    private double dimension1;
    private double dimension2;

    public TwoDimensionalShape(String name, double d1, double d2) {
        this.name = name;
        this.dimension1 = d1;
        this.dimension2 = d2;
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public String getName() {
        return this.name;
    }

    public double getDimension1() {
        return this.dimension1;
    }

    public void setDimension1(double d1) {
        this.dimension1 = d1;
    }

    public double getDimension2() {
        return this.dimension2;
    }

    public void setDimension2(double d2) {
        this.dimension2 = d2;
    }

    public abstract double getArea();

    public int compareTo(TwoDimensionalShape shape) {
        if (this.getArea() == shape.getArea())
            return 0;
        else if (this.getArea() > shape.getArea())
            return 1;
        else
            return -1;
    }

    public void resize(double ratio) {
        if (this.getClassName() == "Rectangle")
            this.setDimension1(this.getDimension1() * ratio);
        else if (this.getClassName() == "Circle") {
            this.setDimension1(this.getDimension1() * Math.sqrt(ratio));
            this.setDimension2(this.getDimension1() * 2);
        } else if (this.getClassName() == "Square") {
            this.setDimension1(this.getDimension1() * Math.sqrt(ratio));
            this.setDimension2(this.getDimension2() * Math.sqrt(ratio));
        }
    }
}
