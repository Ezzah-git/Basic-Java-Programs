class Test {
    String subjName;
    int marks;

    // Default constructor
    Test() {
        subjName = "OOP";
        marks = 30;
    }

    // Parameterized constructor
    Test(String subjName, int marks) {
        this.subjName = subjName;
        this.marks = marks;
    }

    // Display method
    void display() {
        System.out.println("Subject: " + subjName + ", Marks: " + marks);
    }

    // Pass by reference
    void passByReference(Test obj) {
        obj.marks = 29;
    }

    // Duplicate method (returns a copy)
    Test duplicate() {
        return new Test(this.subjName, this.marks);
    }

    // Method to create an array of 10 duplicate objects
    Test[] duplicate10() {
        Test[] duplicates = new Test[10];
        for (int i = 0; i < duplicates.length; i++) {
            duplicates[i] = new Test(this.subjName, this.marks);
        }
        return duplicates;
    }

    public static void main(String[] args) {
        // Object creation
        Test obj1 = new Test();
        Test obj2 = new Test("LAAG", 28);

        System.out.println("Using constructor:");
        obj1.display();
        obj2.display();

        // Pass by reference
        System.out.println("\nAfter passing by reference:");
        obj1.passByReference(obj1);
        obj1.display();

        // Duplicating an object
        System.out.println("\nObject duplication:");
        Test t1 = new Test("ISE", 27);
        Test t2 = new Test();
        System.out.println("Before duplication:");
        t2.display();

        t2 = t1.duplicate();
        System.out.println("After duplication:");
        t2.display();

        // Creating 10 duplicate objects
        System.out.println("\nDuplicated objects:");
        Test[] duplicates = t1.duplicate10();
        for (int i = 0; i < duplicates.length; i++) {
            System.out.println("Object " + (i + 1) + ": " + duplicates[i].subjName + ", Marks: " + duplicates[i].marks);
        }
    }
}
