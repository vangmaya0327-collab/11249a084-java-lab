public class StringFunctionsDemo {
    public static void main(String[] args) {

        // Sample input string
        String str = "Java Programming";

        // Display original string
        System.out.println("Original String: " + str);

        // length() - finds the length of the string
        System.out.println("Length of String: " + str.length());

        // charAt() - returns character at a given index
        System.out.println("Character at index 5: " + str.charAt(5));

        // toUpperCase() - converts string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase() - converts string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // contains() - checks whether a word exists in string
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // equals() - compares two strings
        String str2 = "Java Programming";
        System.out.println("Strings are equal: " + str.equals(str2));

        // concat() - joins two strings
        String result = str.concat(" Language");
        System.out.println("After Concatenation: " + result);

        // substring() - extracts part of a string
        System.out.println("Substring: " + str.substring(0, 4));

        // replace() - replaces a word in string
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // indexOf() - finds position of a character
        System.out.println("Index of 'P': " + str.indexOf("P"));

        // trim() - removes extra spaces
        String spaceString = "  Java Programming  ";
        System.out.println("Trimmed String: " + spaceString.trim());

        // startsWith() and endsWith()
        System.out.println("Starts with 'Java': " + str.startsWith("Java"));
        System.out.println("Ends with 'ing': " + str.endsWith("ing"));

        // Printing Hello three times
        String hello = "Hello";
        System.out.println("Printing Hello three times:");

        System.out.println(hello);
        System.out.println(hello);
        System.out.println(hello);
    }
}