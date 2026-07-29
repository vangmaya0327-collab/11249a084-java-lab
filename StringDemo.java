public class StringDemo {
    public static void main(String[] args) {

        String str = "Java Codes";

        // Display the string
        System.out.println("String: " + str);

        // Find string length
        System.out.println("Length of string: " + str.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Check whether string contains a word
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Display substring
        System.out.println("Substring: " + str.substring(0, 4));
    }
}