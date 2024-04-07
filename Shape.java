public class Shape {
    // Constructor with no parameter
    public Shape() {
        System.out.println("Default Shape constructor called");
    }

    // Constructor with one parameter for square
    public Shape(int side) {
        System.out.println("Square constructor called with side: " + side);
    }

    // Constructor with two parameters for rectangle
    public Shape(int length, int width) {
        System.out.println("Rectangle constructor called with length: " + length + " and width: " + width);
    }

    // Method area with no parameter to display default area message
    public void area() {
        System.out.println("Default area method called");
    }

    // Method area with one parameter to display area of a square
    public void area(int side) {
        System.out.println("Area of square with side " + side + " is: " + (side * side));
    }

    // Method area with two parameters for area of rectangle
    public void area(int length, int width) {
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + (length * width));
    }

    public static void main(String[] args) {
        // Create objects of shape class using different constructor
        Shape shape = new Shape();
        Shape square = new Shape(5);
        Shape rectangle = new Shape(10, 20);

        // Call area methods with different parameters
        shape.area();
        square.area(5);
        rectangle.area(10, 20);
    }
}
