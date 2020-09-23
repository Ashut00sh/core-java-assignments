class Per {
    Per() {
        this(12);
        System.out.println("person no argument ");
    }

    Per(int i) {
        System.out.println("person constructor with para" + i);
    }
}

class Empl {
    Empl() {
        super();
        System.out.println("emp no para");
    }

    Empl(int i) {

        System.out.println("emp with parameter" + i);
    }
}

public class conChain {
    public static void main(String[] args) {
        Empl e = new Empl();
    }
}
