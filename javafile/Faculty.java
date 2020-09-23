
public class Faculty {
    private int facultyid;
    protected double salary;

    void input(int facultyid, double salary) {
        this.facultyid = facultyid;
        this.salary = salary;
    }

    void printsal() {
        System.out.println("faculty id=" + facultyid + "Salary is =" + salary);
    }
}

class FullTimeFaculty extends Faculty {
    private double basicsalary;
    private double allowance;

    void input(int facultyid, double salary, double basicsalary, double allowance) {
        super.input(facultyid, salary);
        this.basicsalary = basicsalary;
        this.allowance = allowance;

        super.salary = basicsalary + allowance;
    }
}

class PartTimeFaculty extends Faculty {
    int workinghours;
    int rateperhours;

    void input(int facultyid, double salary, int workinghours, int rateperhours) {
        super.input(facultyid, salary);
        salary = workinghours * rateperhours;
    }
}

class FacDemo {
    public static void main(String[] args) {

    }

}
