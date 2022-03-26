package Homework3;

public class Shape {
    private static final String CLASS_NAME = "Shape";
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public String getName() {
        return this.name;
    }

}
