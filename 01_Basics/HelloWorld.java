class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}

Create these files one by one:

📁 01_Basics

Addition.java

class Addition {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a + b));
    }
}


EvenOdd.java

class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}





02_OOPs/ClassObject.java

class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "SS";
        s.display();
    }
}

🔹 STEP 8: Add Constructor Program

File:

02_OOPs/ConstructorDemo.java

class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "SS");
        s.display();
    }
}
