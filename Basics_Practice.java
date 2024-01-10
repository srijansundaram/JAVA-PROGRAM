import java.util.Scanner;

public class Basics_Practice {
    public static void main(String[] args) {
        
        double total_marks;
        double m1, m2, m3, m4, m5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Marks: ");
        total_marks = sc.nextDouble();

        System.out.println("Enter marks in Subject 1: ");
        m1 = sc.nextDouble();
        System.out.println("Enter marks in Subject 2: ");
        m2 = sc.nextDouble();
        System.out.println("Enter marks in Subject 3: ");
        m3 = sc.nextDouble();
        System.out.println("Enter marks in Subject 4: ");
        m4 = sc.nextDouble();
        System.out.println("Enter marks in Subject 5: ");
        m5 = sc.nextDouble();

        double scored = m1+m2+m3+m4+m5;

        double percentage = (scored / total_marks) * 100;
        System.out.printf("Percentage is : %.2f ", percentage);

    }
}
