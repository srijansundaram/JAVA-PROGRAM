public class Arrays_MultiDim {
    public static void main(String[] args) {
         int [] marks; // 1-D array
         int [][] flats; // 2-D array

         flats = new int [2][3];
         flats[0][0] = 001;
         flats[0][1] = 002;
         flats[0][2] = 003;
         flats[1][0] = 101;
         flats[1][1] = 102;
         flats[1][2] = 103;

        /* Displaying using for loop
         System.out.println("Printing using for loop");
         for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        */
        System.out.println("Printing using for each loop");
        for (int[] innerArray : flats) {
            for (int val : innerArray) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
