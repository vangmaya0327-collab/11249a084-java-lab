interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {

    public void displayA() {
        System.out.println("THIS IS INTERFACE A");
    }

    public void displayB() {
        System.out.println("THIS IS INTERFACE B");
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.displayA();
        obj.displayB();
    }
}
