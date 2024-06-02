import java.util.Scanner;

class NegativeException extends Exception{
    public NegativeException(String errorMessage){
        super(errorMessage);
    }
}

/**
 * ExceptionHandling
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        try{
            if (value < 0) {
                throw new NegativeException("You have entered a negative number"); 
            }
            else{
                System.out.println("You have entered a positive number");
            }
        } catch(NegativeException e) {System.out.println(e);}
    }
}