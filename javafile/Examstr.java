import java.util.Scanner;

public class Examstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String st1 = " ";
        System.out.println(st.length());
        for (int i = st.length() - 1; i >= 0; i--) {
            st1 = st1 + st.charAt(i);
        }
        System.out.println(st1);
        sc.close();
    }
}