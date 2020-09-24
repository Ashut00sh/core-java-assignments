import java.util.*;

abstract class Processor {
    int vardata;

    abstract void Process();

    void showdata() {
        System.out.println("Data=" + vardata);
    }
}

class Factorial extends Processor {
    void process() {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        sc.close();
        vardata = result;
    }
}

class CirclE extends Processor {
    void Process() {
        final float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        float rad = sc.nextFloat();
        float area = pi * rad * rad;
        vardata = (int) area;
        sc.close();
    }
}

class AbsDemo {
    public static void main(String[] args) {
        System.out.println("Enter ch 1:factorial,2:area of circle ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        do {

            switch (ch) {
                case 1:
                    Processor t = new Factorial();
                    t.Process();
                    t.showdata();
                    break;
                case 2:
                    Processor c = new CirclE();
                    c.Process();
                    c.showdata();

                default:
                    break;

            }
            sc.close();
        } while (ch != 3);

    }
}