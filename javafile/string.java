//Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;

class String28 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        String name[] = new String[a];
        for (int i = 0; i < name.length; i++) {
            name[i] = s.nextLine();

        }
        for (String abc : name) {
            System.out.println(abc);
        }
        System.out.println(" ");
    }
}
