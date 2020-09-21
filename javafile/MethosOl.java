
//36. Create a class MathOperation containing overloaded methods
// ‘multiply’ to calculate multiplication of following arguments. 
//a.  two integers 
//b.  three floats 
//c.  all elements of array 
//d. one double and one integer 
import java.util.Scanner;

public class MethosOl {
    static void multiply(int a, int b) {
        int c = a * b;
        System.out.println("mul of two integers=" + c);
    }

    static void multiply(float a, float b, float c) {
        float d = a * b * c;
        System.out.println("mul of three float =" + d);

    }

    static void multiply(double a, int b) {
        double c = b * a;
        System.out.println("mul of one double and one int =" + c);
    }
}

class MathOperationol {
    public static void main(String[] args) {
        MethosOl.multiply(4, 5);
        MethosOl.multiply(5.0, 4);
        MethosOl.multiply(4f, 5f, 6f);
    }
}