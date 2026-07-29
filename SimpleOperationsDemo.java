public class SimpleOperationsDemo {

    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // Adding 5 to a using += operator
        a += 5;
        System.out.println("After a += 5, value of a = " + a);

        // Relational operation
        System.out.println("a > b = " + (a > b));

        boolean x = true, y = false;

        System.out.println("x AND y = " + (x && y));
        System.out.println("x OR y = " + (x || y));
        System.out.println("NOT x = " + (!x));

        // Finding maximum value
        int max = Math.max(a, b);
        System.out.println("Maximum value between a and b = " + max);
    }
}