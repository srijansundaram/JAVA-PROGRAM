import java.io.*;
public class Exp_10 {
    public static void main(String[] args) {
        // Writing to a file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a file handling example.\n");
            writer.write("We are writing this text to a file.");
            writer.close();
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("\nContent of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
