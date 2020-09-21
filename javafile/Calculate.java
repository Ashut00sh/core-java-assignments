import java.util.Scanner;

//Create a class MathOperation that has four static methods. 
//add() method that takes two integer numbers as parameter and 
//returns the sum of the numbers. subtract() method 
//that takes two integer numbers as parameter and returns the difference of the numbers.
// multiply() method that takes two integer numbers as parameter and returns the product.
// power() method that takes two integer numbers as parameter and 
//returns the power of first number to second number. 
//Create another class Demo (main class) that takes the two numbers from the
//user and calls all four methods of MathOperation class by 
//providing entered numbers and prints the return values of every method.

class MathOperation {
    static int a, b;

    static int add(int fir, int sec) {
        a = fir;
        b = sec;
        return a + b;
    }

    static int sub(int fir, int sec) {
        a = fir;
        b = sec;
        return a - b;
    }

    static int multiply(int fir, int sec) {
        a = fir;
        b = sec;
        return a * b;
    }

    static int power(int fir, int sec) {
        a = fir;
        b = sec;
        long res = 1;
        for (; b != 0; --b) {
            res = res * a;
        }
        return (int) res;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, t;
        System.out.println("Enter two numbers");
        r = sc.nextInt();
        t = sc.nextInt();

        int y = MathOperation.add(r, t);
        int u = MathOperation.sub(r, t);
        int i = MathOperation.multiply(r, t);
        int o = MathOperation.power(r, t);
        System.out.println("addition =" + y + " substraction=" + u + " multiplication=" + i + " power= " + o + " ");

    }
}