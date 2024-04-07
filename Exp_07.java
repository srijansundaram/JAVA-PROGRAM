class Parent {
    // Method with no parameters
    void display() {
            System.out.println("Parent class display method");
        }
    
        // Method overloaded with a parameter
        void display(String message) {
            System.out.println("Parent class display method: " + message);
    }
}
    
class Child extends Parent {
    // Overriding the display method of Parent class
    @Override
    void display() {
            super.display(); // Calling the parent class method using super keyword
            System.out.println("Child class display method");
    }
    
    // Overloading the display method of Parent class
    void display(int number) {
            System.out.println("Child class display method: " + number);
    }
    
    // Final method which cannot be overridden in child classes
        final void finalDisplay() {
            System.out.println("Final display method in Parent class");
    }
}
    
public class Exp_07 {
    public static void main(String[] args) {
        Child child = new Child();
    
        // Method overloading
        child.display(); // Calls Child class display() method
        child.display("Hello"); // Calls Parent class display(String message) method
        child.display(10); // Calls Child class display(int number) method
    
        // Final method
        child.finalDisplay(); // Calls finalDisplay() method of Parent class
    }
}  
