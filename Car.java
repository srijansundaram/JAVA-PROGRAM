public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display the car details
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }

    public static void main(String[] args) {
        // Create an object of Car class
        Car myCar = new Car("Tesla", "Model S", 2020);

        // Use display function on the object to display details
        myCar.displayDetails();
    }
}