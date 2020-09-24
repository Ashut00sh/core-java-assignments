class One {

    void Set() {
        System.out.println("Class One Set method");
    }

    void Get() {
        System.out.println("Class One Get method");
    }
}

class Two extends One {
    void Set() {
        System.out.println("Class Two Set method is called");
    }

    void Gett() {
        System.out.println("Class Two gett method called");
    }
}

public class Down {
    public static void main(String[] args) {
        // One o = new Two();// upcast
        // Two t = (Two) o;// downcast
        // o.Get();
        // o.Set();
        // t.Gett();
        One arr[] = { new One(), new Two() };
        for (One a : arr) {
            if (a instanceof Two) {
                Two t = (Two) a;
                t.Gett();
            }
        }
    }
}
