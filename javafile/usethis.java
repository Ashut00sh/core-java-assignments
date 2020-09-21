
//Write a program to demonstrate functionalities of this keyword in java. 
class Emp {
    int rno;
    String name;

    void SetData(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    void ShowData() {
        System.out.println(rno + " " + name);
    }
}

class Employee {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.SetData(24, "ashutosh");
        e.ShowData();
    }
}