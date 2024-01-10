import java.util.Scanner;

public class Basics_Practice {
    public static void main(String[] args) {
        
        float percentage;
        int total_marks;
        int m1, m2, m3, m4, m5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Marks: ");
        total_marks = sc.nextInt();

        System.out.println("Enter marks in Subject 1: ");
        m1 = sc.nextInt();
        // System.out.println("Enter marks in Subject 2: ");
        // m2 = sc.nextInt();
        // System.out.println("Enter marks in Subject 3: ");
        // m3 = sc.nextInt();
        // System.out.println("Enter marks in Subject 4: ");
        // m4 = sc.nextInt();
        // System.out.println("Enter marks in Subject 5: ");
        // m5 = sc.nextInt();

        int scored = m1;

        percentage = (float)((scored / total_marks) * 100);
        System.out.println("Percentage is :: " + percentage);

    }
}
