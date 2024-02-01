import java.util.Scanner;

public class Exp_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-Else Statement ->> 

        System.out.println("If-Else Statement");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 70) {
            System.out.println("You can drive.");
        }
        else if (age >= 15 && age < 18) {
            System.out.println("You can opt for learning license.");
        } 
        else {
            System.out.println("You can't drive.");   
        }

        // While loop ->> 

        System.out.println("While loop");
        System.out.println("Enter a number whose table you want: ");
        int num = sc.nextInt();

        System.out.println("Multiplication table for " + num + ": ");
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        // For loop ->>

        System.out.println("For loop");
        System.out.println("Enter a number whose table you want: ");
        int digit = sc.nextInt();

        System.out.println("Multiplication table for " + digit + ":");

        for (int j = 0; j <= 10; j++) {
            System.out.println(digit + " x " + j + " = " + (digit * j));
        }

        // Do while loop ->>

        System.out.println("Do-while loop");
        System.out.println("Enter a number whose table you want: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        int k = 1;

        do {
            System.out.println(number + " x " + k + " = " + (number * k));
            k++;
        } while (k<=10);

        // Switch Statement ->>

        System.out.println("Switch Statement");
        System.out.println("Enter your rating on scale of 1-5: ");
        int rating = sc.nextInt();

        String rated;

        switch (rating) {
            case 1:
                rated = "Worst";
                break;

            case 2:
                rated = "Bad";
                break;

            case 3:
                rated = "Good";
                break;
                
            case 4:
                rated = "Excellent";
                break;
                
            case 5:
                rated = "Fabulous";
                break;
        
            default:
                rated = "Invalid rating";
                break;
        }

        System.out.println("You rated us " + rated + ". Thanks for the feedback!");
    }
}
