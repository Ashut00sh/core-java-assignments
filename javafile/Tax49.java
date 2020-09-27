import java.util.Scanner;

interface Taxable {
    double ST = 0.07;// public final static
    double IT = 0.105;

    void CalTax();// abstrct,default
}

class Employeee implements Taxable {
    int empid;
    String name;
    double salary;

    Employeee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public void CalTax() {
        double IncomeTax;
        IncomeTax = IT * salary;

        System.out.println("income tax" + IncomeTax);
    }
}

class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void CalTax() {
        double SalesTax;
        SalesTax = ST * price;

        System.out.println("sales tax" + SalesTax);
    }
}

public class Tax49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter empid,name,salary");
        int empid = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        Employeee e = new Employeee(empid, name, salary);
        System.out.println("Enter pid, price,quantity");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product p = new Product(pid, price, quantity);
        e.CalTax();
        p.CalTax();
        sc.close();
    }
}