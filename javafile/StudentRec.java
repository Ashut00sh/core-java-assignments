
//Create a class Student having data members name, roll no., age and score. 
//Write a program to accept 10 records of student and store them in an array. 
//And then arrange the student records based on the score group 
//[0-50], [50-65], [65-80], [80-100].
import java.util.*;

public class StudentRec {
    String name;
    int rollno;
    int age;
    int score;

    StudentRec(String name, int rollno, int age, int score) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.score = score;
    }

    static void GroupStu(StudentRec arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].score <= 50) {
                System.out.println(
                        "Score Group of student = D" + " " + "name=" + arr[i].name + " rollno=" + arr[i].rollno);
            } else if (arr[i].score > 50 && arr[i].score <= 65) {
                System.out.println(
                        "Score Group of student = C" + " " + "name=" + arr[i].name + " rollno=" + arr[i].rollno);
            } else if (arr[i].score > 65 && arr[i].score <= 80) {
                System.out.println(
                        "Score Group of student = B" + " " + "name=" + arr[i].name + " rollno=" + arr[i].rollno);
            } else if (arr[i].score > 80 && arr[i].score <= 100) {
                System.out.println(
                        "Score Group of student = A" + " " + "name=" + arr[i].name + " rollno=" + arr[i].rollno);
            }
        }
    }

    void show() {
        System.out.println(
                "students records=" + "name=" + name + " rollno= " + rollno + "age= " + age + "score= " + score);
    }

}

class StudentRecDemo {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        StudentRec arr[] = new StudentRec[2];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name");
            k.next();// clear buffer;
            String name = k.nextLine();
            System.out.println("Enter rollno");
            int rollno = k.nextInt();
            System.out.println("Enter age");
            int age = k.nextInt();
            System.out.println("Enter score");
            int score = k.nextInt();
            StudentRec sr = new StudentRec(name, rollno, age, score);
            arr[i] = sr;
        }
        StudentRec.GroupStu(arr);

        for (StudentRec abc : arr) {
            abc.show();
        }
    }
}