//Write a program to demonstrate this() construct functionality.

class Person {
    Person() {
        // this(10);
        System.out.println("no argument person");
    }

    Person(int a) {
        System.out.println("with para person");

    }
}

class Emp extends Person {
    Emp() {
        // this(10);
        System.out.println("no argument Employee");

    }

    Emp(int a) {
        this();
        System.out.println("with para Employee");
    }
}

class EmpDemo {
    public static void main(String[] args) {
        Emp e = new Emp(10);
    }
}