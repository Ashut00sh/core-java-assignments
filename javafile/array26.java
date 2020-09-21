//Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.Scanner;
class Array26{
public static void main(String[]args){
int n,m,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows ");
n=sc.nextInt();
m=sc.nextInt();
int arr[][]=new int [n][m];


for(int i=0;i<n;i++){
System.out.println("Enter array elements");
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
sum=sum+arr[i][j];
}
}
for(int ar[] : arr){
			for(int a : ar){
				System.out.print("  "+a);
			}
			System.out.println("");
		}
		System.out.println("Sum of all elements = "+sum);

}
}
