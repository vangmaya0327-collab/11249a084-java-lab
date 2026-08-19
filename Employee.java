class Employee {
    String name;
    final int empId;
    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Display method
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", 101);

        e1.display();

        // Uncommenting the next line will cause a compilation error
        // e1.empId = 102;
    }
}