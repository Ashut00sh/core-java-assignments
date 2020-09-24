
class Student {
    protected int rollno;
    protected float percentage;

    Student() {
        rollno = 102;
        percentage = 53.33f;
    }

    Student(int rollno, float percentage) {
        this.rollno = rollno;
        this.percentage = percentage;
    }

    void show() {
        System.out.println("rollno=" + rollno + "percentage=" + percentage);
    }
}

class CollegeSt extends Student {
    int semester;

    CollegeSt() {
        semester = 1;
    }

    CollegeSt(int rollno, float percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    void show() {
        super.show();
        System.out.println("semester=" + semester);
    }
}

class SchStudent extends Student {
    private int ClassName;

    SchStudent() {
        ClassName = 10;// how to get 10th which datatype is used
    }

    SchStudent(int rollno, float percentage, int ClassName) {
        super(rollno, percentage);
        this.ClassName = ClassName;
    }

    void show() {
        super.show();
        System.out.println("Classname ==" + ClassName);
    }
}

class StudDemo {
    public static void main(String[] args) {
        Student arr[] = { new Student(), new CollegeSt(), new CollegeSt(), new SchStudent(), new SchStudent(),
                new SchStudent() };
        for (Student a : arr) {
            a.show();
        }
    }
}