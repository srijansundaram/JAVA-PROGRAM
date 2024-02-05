public class Strings_Method {
    public static void main(String[] args) {
        String a = "Mercedes";

        // int length = a.length();
        // System.out.println(length);

        //  String lowercase = a.toLowerCase();
        //  System.out.println(lowercase);

        // String uppercase = a.toUpperCase();
        // System.out.println(uppercase);

        // String b = "          BMW            ";
        // System.out.println(b);        
        // String trimmedString = b.trim();
        // System.out.println(trimmedString);
        // System.out.println(b.trim());

        // System.out.println(a.substring(3)); //  from index 3 till the end of string
        // System.out.println(a.substring(2, 4)); // End index is excluded 

        // System.out.println(a.replace('c', 's')); //  Replace all occurrences of character with another one
        // System.out.println(a.replace("Mer", "mur")); //  Replace only the first occurrence
        
        // System.out.println(a.startsWith("Mer")); //  Returns true if the string starts with specified value
        // System.out.println(a.endsWith("Mer")); // Returns true if the string ends with the specified value

        // System.out.println(a.charAt(2)); //  Returns the character at specified index in string value.

        // System.out.println(a.indexOf("e")); //  Returns the first occurrence of the character
        // System.out.println(a.lastIndexOf("e")); //  Returns the last occurrence of the character
        // System.out.println(a.indexOf("e", 3)); //   Searches for the character after the given index
        // System.out.println(a.lastIndexOf("e", 5)); //   Searches for the character before the given index
        // System.out.println(a.indexOf("bmw"));  // If not found returns -1

        // System.out.println(a.equals("mercedes")); //  It checks whether two strings are equal or not.
        // System.out.println(a.equalsIgnoreCase("mercEdeS")); // It compares two strings irrespective of case sensitivity.

        // Escape Sequence Characters
        System.out.println("Hello,\"World\"\tThis is a tab\nThis is a new line\rThis is a carriage return\fThis is a form feed\\This is a backslash");
    }
}
