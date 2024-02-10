public class Arrays {
    public static void main(String[] args) {
        
        /*  Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use an array
        */

        int [] marks = new int [5]; 
        /*  Another way to intialize array:-
            
         1. int [] marks;
            marks = new int [5];

         2. int [] marks = {98, 58, 68, 87, 73}

        */

        marks[0] = 100;
        marks[1] = 90;
        marks[2] = 58;
        marks[3] = 78;
        marks[4] = 65;
        System.out.println(marks[4]); 
        
    }
}