public class Arrays_Operations {
    public static void main(String[] args) {

        int [] marks = {98, 58, 68, 87, 73};

        /*  .length used to display length of array
        System.out.println(marks.length); 
        */

        /*  naive way to display an array
        System.out.println("Naive way to display an array");
        System.out.println(marks[0]); 
        System.out.println(marks[1]); 
        System.out.println(marks[2]); 
        System.out.println(marks[3]); 
        System.out.println(marks[4]); 
        */

        /* displaying an array using for loop
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        */

        /* Displaying array in reverse order
        System.out.println("Printing array in reverse order");
        for (int i = marks.length - 1; i>0; i--) {
            System.out.println(marks[i]);
        }
        */

        /* Displaying array using for each loop
        for (int element : marks) {
            System.out.println(element);
        }
        */
    }    
}