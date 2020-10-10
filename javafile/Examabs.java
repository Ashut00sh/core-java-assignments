import java.util.Scanner;

abstract class Process {
    double data;

    abstract void pross(double data);

    void show() {
        System.out.println(data);
    }
}

class Factorial extends Process {
    double fac = 1;

    void pross(double a) {
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        data = fac;
    }
}

class Circle1 extends Process {
    double area;

    void pross(double a) {
        area = 3.14 * a * a;
        data = area;
    }

}

class Examabs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                int b = sc.nextInt();
                Process p = new Factorial();
                p.pross(b);
                p.show();
                break;

            case 2:
                int c = sc.nextInt();
                Process p1 = new Circle1();
                p1.pross(c);
                p1.show();
        }
    }
}