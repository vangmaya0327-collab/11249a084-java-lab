interface A {
    void showA();
}

interface B extends A {
    void show();
}

interface C extends A {
    void show();
}

interface D extends B, C {
    void showD();
}

class hybridinheritance implements D {

    public void showA() {
        System.out.println("Interface A");
    }

    public void show() {
        System.out.println("Interface B and C");
    }

    public void showD() {
        System.out.println("Interface D");
    }

    public static void main(String[] args) {
        hybridinheritance obj = new hybridinheritance();

        obj.showA();
        obj.show();
        obj.showD();
    }
}
