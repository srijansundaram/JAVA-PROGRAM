public class Operators_Practice {
    public static void main(String[] args) {
        char grade = 'B';

        // Encrypting grade
        grade = (char)(grade + 8);

        System.out.println(grade);

        // Decrypting grade
        grade = (char)(grade-8);

        System.out.println(grade);
    }
}
