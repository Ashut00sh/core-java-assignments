
//37. Create a class Person with properties (name and age) with following features. 
//a. Default age of person should be 18.
//b. A person object can be initialized with name and age.
//c. Method to display name and age of person
//Create another class PersonDemo ( main class ) that demonstrates 
//the functionalities of Person class by creating Person object and calling methods.

public class Person {
    int age;
    String name;

    Person() {
        age = 18;
        name = "sachin";
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void Display() {
        System.out.println(age + " " + name);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.Display();
        Person p1 = new Person(26, "Ashutosh");
        p1.Display();
    }
}