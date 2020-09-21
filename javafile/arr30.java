//Create an integer type 2-D array of size [3X3]. Take the elements from the user and 
//then calculate the sum of the elements present in the diagonal.

import java.util.Scanner;

class Array30 {

    public static void main(String[] args) {
        int a, b, dia = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row");
        a = sc.nextInt();
        System.out.println("Enter no of columns");
        b = sc.nextInt();
        int three[][] = new int[a][b];
        System.out.println("Enter array element");
        for (int i = 0; i < three.length; i++) {
            for (int j = 0; j < three.length; j++) {
                three[i][j] = sc.nextInt();

            }
            dia = dia + three[j][i];
        }
        for (int abc[] : three) {
            for (int rt : abc) {
                System.out.print(rt);
            }
            System.out.println("");
        }
        System.out.println("diagonal sum of array element is=" + dia);
    }
}