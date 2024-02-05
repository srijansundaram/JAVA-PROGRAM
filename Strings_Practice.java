public class Strings_Practice {
    public static void main(String[] args) {

        // Problem 1
        // String name = "GaGaN";
        // name = name.toLowerCase();
        // System.out.println(name);

        // Problem 2
        // String text = "To Lower Case";
        // text = text.replace(" ", "_");
        // System.out.println(text);

        // Problem 3
        // String name = "Faisal";
        // String letter = "Dear <|name|>, Thanks a lot!";
        // letter =  letter.replace("<|name|>", name);
        // System.out.println(letter);

        // Problem 4
        // String a = "This  is  dangerous";
        // System.out.println(a.indexOf("  "));
        // System.out.println(a.indexOf("   "));

        // Problem 5
        String letter1 = "Dear Gagan, This Car is Nice. Thanks!";
        letter1 = letter1.replace(", ", ", \n\t");
        letter1 = letter1.replace(". ", ". \n\t");
        System.out.println(letter1);
}
}