
//Create a class Circle that has two data members, 
//one to store the radius and another to store area and 
//three methods first init() method to input radius from user, 
//second calculateArea() method to calculate area of circle and third display()
// method to display values of radius and area. 
//Create class CircleDemo ( main class) that creates the Circle object and 
//calls init(), calculateArea() and display() methods.
import java.util.Scanner;

public class Circle {
    int rad;
    double area, pi = 3.14;

    // Scanner sc=new Scanner (System.in);
    void Init(int rad) {
        this.rad = rad;

    }

    void CalculateArea(int rad) {
        area = pi * rad * rad;
    }

    void display() {
        System.out.println("given radius  and area==" + rad + " " + area);
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter radius");
        int rad = r.nextInt();
        Circle c = new Circle();
        c.CalculateArea(rad);
        c.Init(rad);
        c.display();
    }
}