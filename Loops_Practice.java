public class Loops_Practice {
    public static void main(String[] args) {

    // Problem 1-->>
        // int n= 4;
        // for (int i = n; i > 0; i--) {
        //     for(int j = 0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

    // Problem 2-->>
        // int sum = 0;
        // int n = 3;
        // int i = 0;
        // while (i<n) {
        //     sum = sum + (2*1);
        //     i++;
        // }
        // System.out.printf("Sum of first %d even numbers is %d", n, sum);
        // // First 3 even numbers are 0, 2, 4;

    // Problem 3-->>
        // int n = 5;
        // System.out.println("Multiplication table of " +n);
        // for(int i = 1; i<=10; i++){
        //     System.out.printf("%d x %d = %d\n", n, i, n*i);
        // } 
    
    // Problem 4-->>
        // int n = 10;
        // System.out.printf("Multiplication table of %d in reverse order", n);
        // for(int i = 10; i>=1; i--){
        //     System.out.printf("%d x %d = %d\n", n, i, n*i);
        // }

    // Problem 5-->>
        // int n = 4;
        // int factorial = 1;
        // for(int i=1; i<=n; i++){
        //     factorial *= i;
        // }
        // System.out.print(factorial);

    // Problem 6-->>
        // int n = 5;
        // int i =1;
        // int factorial = 1;
        // while (i<=n) {
        //     factorial *= i;
        //     i++;
        // }
        // System.out.println(factorial);
    
    // Problem 7-->>
        // int n = 4;
        // int i = 1;
        // int j;
        // while (i<=n) {
        //     j = i;
        //     while (j<=n) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     i++;
        //     System.out.print("\n");
        // }
    
    // Problem 8-->>
        int n = 8;
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum += n*i;
        } 
        System.out.println(sum);
    }   
}
