package Lab3;

public class Rectangle {
	private double Height;
	private double Width;

	public Rectangle() {
		Height = 1.0;
		Width = 1.0;
	}

	public Rectangle(int Height, int Width) {
		this.Height = Height;
		this.Width = Width;
	}

	public void setHeight(double Height) {
		if (Height >= 0.0 && Height <= 20.0)
			this.Height = Height;
		else
			System.out.println("Height out of range!");
	}

	public void setWidth(double Width) {
		if (Width >= 0.0 && Width <= 20.0)
			this.Width = Width;
		else
			System.out.println("Width out of range!");
	}

	public double getPerimeter() {
		return 2 * (this.Height + this.Width);
	}

	public double getArea() {
		return (this.Height * this.Width);
	}

	public void printAll() {
		System.out.println("Height: " + this.Height);
		System.out.println("Width: " + this.Width);
		System.out.println("Perimeter: " + this.getPerimeter());
		System.out.println("Area: " + this.getArea());
		System.out.println();

	}
}
