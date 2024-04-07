import java.util.Scanner;

    public class Exp_02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd");
        }

        System.out.println("Multiplication table for " + num + ":");

        for (int j = 0; j <= 10; j++) {
            System.out.println(num + " x " + j + " = " + (num * j));
        }
        }
    }
    
