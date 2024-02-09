import java.util.Scanner;
public class Conditionals_Switch_Practice {

    public static void main(String[] args) {
        
        // Problem 1 -->>
        // int m1, m2, m3;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your marks in Physics");
        // m1 = sc.nextInt();

        // System.out.println("Enter your marks in Chemistry");
        // m2 = sc.nextInt();

        // System.out.println("Enter your marks in Math");
        // m3 = sc.nextInt();

        // float avg = (m1+m2+m3)/3.0f; // Assumed total marks to be 100
        // System.out.printf("Your overall percentage is %f\n", avg);

        // if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        //{
        //     System.out.println("Congratulations, You have been promoted\n");
        // } 
        // else
        //{
        //     System.out.println("Sorry, You have not been promoted! Please try again.\n");
        // }

        // Problem 2 -->>
        // float tax = 0;

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your income in lakhs per annum: ");
        // float income = sc.nextFloat(); 

        // if (income<=2.5) 
        // {
        //     tax = tax + 0;
        //     System.out.printf("Your payable tax amount is %f\n", tax);
        // }

        // else if (income>2.5f && income<=5.0f) 
        // {
        //     tax = tax + 0.05f * (income - 2.5f);
        //     System.out.printf("Your payable tax amount is %f\n", tax);
        // }

        // else if (income>5.0f && income<=10.0f) 
        // {
        //     tax = tax + 0.2f * (income - 5.0f);
        //     System.out.printf("Your payable tax amount is %f\n", tax);
        // }

        // else if (income>10.0f) 
        // {
        //     tax = tax + 0.3f * (income - 10.0f);
        //     System.out.printf("Your payable tax amount is %f\n", tax);
        // }

        // Problem 3-->>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the day of week: ");
        // int day = sc.nextInt();

        // String name;
        
        // switch (day) {
        //     case 1:
        //         name = "Monday";
        //         break;
        //     case 2:
        //         name = "Tuesday";
        //         break;
        //     case 3:
        //         name = "Wednesday";
        //         break;
        //     case 4:
        //         name = "Thursday";
        //         break;
        //     case 5:
        //         name = "Friday";
        //         break;
        //     case 6:
        //         name = "Saturday";
        //         break;
        //     case 7:
        //         name = "Sunday";
        //         break;
        
        //     default:
        //         name = "Inavalid input";
        //         break;
        // }
        // System.out.println("Today is " +name);
        
        // Problem 4 -->>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a year: ");
        // int year = sc.nextInt();

        // if(year % 400 == 0){
        //     System.out.printf("%d is a leap year.\n", year);
        // }
        // else if(year % 100 == 0){
        //     System.out.printf("%d is not a leap year.\n", year);
        // }
        // else if(year % 4 == 0){
        //     System.out.printf("%d is a leap year.\n", year);
        // }
        // else{
        //     System.out.printf("%d is not a leap year.\n", year);
        // }

        // Problem 5 -->>
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website name:");
        String website = sc.next();

        if(website.endsWith(".org"))
        {
            System.out.println("It is an organisational website.");
        }

        else if(website.endsWith(".com"))
        {
            System.out.println("It is an commercial website.");
        }

        else if(website.endsWith(".in"))
        {
            System.out.println("It is an indian website.");
        }
    }
}