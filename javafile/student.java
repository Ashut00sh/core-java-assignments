//Create a class Student with 2 data members rno and name. 
//Create one method setData() that takes roll number and 
//student name as parameter and stores them in data members rno and name. 
//Create one more method showData() to print the data member values. 
//Create another class ( main class) StudentDemo that creates Student 
//class object and calls setData() and showData() methods.

class Student {
    int rno;
    String name;

    void SetData(int rono, String sname) {
        rno = rono;
        name = sname;
    }

    void ShowData() {
        System.out.println(rno + " " + name);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.SetData(101, "ashutosh");
        s.ShowData();
    }
}