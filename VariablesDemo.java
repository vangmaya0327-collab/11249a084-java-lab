public class VariablesDemo {

    int instanceVar = 10;                 
    static String staticVar = "I am static"; 

    public void showVariables() {
        int localVar = 5;                 

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.showVariables();
    }
}