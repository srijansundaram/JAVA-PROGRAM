import java.util.Vector;
public class Exp_05a {
    public static void main(String[] args) {
        // Create a vector to store integers
        Vector<Integer> vector = new Vector<Integer>();

        // Add some integers to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Print the vector
        System.out.println("Vector: " + vector);

        // Access an element of the vector
        System.out.println("First element: " + vector.firstElement());

        // Remove an element from the vector
        vector.remove(1);

        // Print the vector after removing an element
        System.out.println("Vector after removing an element: " + vector);
    }
}

