
import java.util.Scanner;
class Revarray{
public static void main(String[]args){
int n;
Scanner sc=new Scanner (System.in);
System.out.println("Enter number");
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("Enter array element");
for(int i=0; i<n;i++){
  a[i]=sc.nextInt();
  }
for(int i=0,j=n-1; i<n; i++,j--){
b[i]=a[j];
}
for(int i=0;i<n;i++){
System.out.println("Reverse array is ="+b[i]);}
}
}
