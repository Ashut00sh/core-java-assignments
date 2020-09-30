package Tostring;

import java.util.Scanner;

class Emp {
    private int empid;
    private String name;
    private double salary;

    public Emp(int empid, String name, double salary) {
        super();
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid + " " + name + " " + salary;
    }

    public boolean equals(Object obj) {
        if (obj == null)

            return false;
        if (obj instanceof Emp) {
            Emp e = (Emp) obj;
            return empid == e.empid;
        }
        return false;
    }
}

public class xyz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp arr[] = new Emp[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Emter pid");
            int pid = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter salaary");
            double salary = sc.nextDouble();
            Emp e = new Emp(pid, "name", salary);
            arr[i] = e;

        }
        sc.close();

        for (Emp a : arr) {
            System.out.println(a);
        }
    }

}
