public class Arrays_Practice {
    public static void main(String[] args) {
        
        /*  Problem 1 -->>
        float [] num = {4.5f, 2.5f, 3.5f, 6.5f, 7.0f};
        float sum = 0;
        for (float f : num) {
            sum = sum + f;
        }
        System.out.println("The value of sum is: " + sum);
        */

        /*  Problem 2 -->>
        float [] number = {4.5f, 2.5f, 3.5f, 6.5f, 7.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float f : number) {
            if (num==f) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        }
        else{
        System.out.println("The value is not present in the array");
        }
        */

        /*  Problem 3 -->>
        int [] marks = {75, 65, 25, 35, 85};
        int sum = 0;
        for(int element:marks){
            sum = sum+element;
        }
        float average = (float) sum/marks.length;
        System.out.println("The value of average is " + average);
        */

        /*  Problem 4 -->>
        int [][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int [][] result = {{0, 0, 0}, {0, 0, 0}};
        for(int i=0; i<matrix1.length; i++){
            for(int j = 0; j<matrix1[i].length; j++){
                result [i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        */

        /*  Problem 5 (Reversing array) -->>
        int [] arr = {75, 65, 25, 35, 85};
        int n = Math.floorDiv(arr.length, 2);
        int l = arr.length;
        int temp;
        for (int i = 0; i<n; i++) {
            // Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
        */

        /* Problem 6 -->>
        int [] arr = {75, 65, 25, 35, 85};
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The maximum value in the array is " + max);
        */

        /*  Problem 7 -->>
        int [] arr = {75, 65, 25, 35, 85};
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("The minimum value in the array is " + min);
        */

        // Problem 8 -->>
        int [] arr = {5, 6, 7, 35, 85};
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
           System.out.println("The array is sorted"); 
        }
        else{
            System.out.println("The array is not sorted"); 
        }
    }
}