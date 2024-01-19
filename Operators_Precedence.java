public class Operators_Precedence {
    public static void main(String[] args) {

        // Precedence
        int a = 6*5-34/2;
        /*
        highest precedence goes to * and /. 
         = 30-34/2
         = 30-17
         = 13
         */
        System.out.println(a);

        // Associativity
        int b = 60/5-34*2;
        /*
         = 12-34*2
         = 12 - 68
         = -56
         */
        System.out.println(b);

    }
}
