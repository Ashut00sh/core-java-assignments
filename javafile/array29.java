// Write a program to print the total number of one-D arrays in a two-D array
// and
// the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;

class array29 {
    public static void main(String[] args) {
        int a, b, out = 0, in = 0;
        Scanner w = new Scanner(System.in);
        System.out.println("Enter row");
        a = w.nextInt();
        System.out.println("Enter columns");
        b = w.nextInt();
        int arr[][] = new int[a][b];
        System.out.println("Enter array element");
        for (int i = 0; i < arr.length; i++) {
            out++;
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = w.nextInt();
                in++;
            }
        }

        for (int abc[] : arr) {
            for (int er : abc) {
                System.out.print(er);
            }
            System.out.println("");
        }
        System.out.println("Total no of one D array =" + out);
        System.out.println("Totle no of element in one D array =" + in);
    }
}
