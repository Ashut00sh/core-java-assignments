//Write a program to fine the smallest and greatest number present in the array of integer type.

import java.util.Scanner;
class Arraymax{
public static void main(String[]args){
int a,min=0,max=0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number");
 a=sc.nextInt();
 int arr[]=new int[a];
 System.out.println("Enter array element ");
 for(int i=0;i<a;i++){
  arr[i]=sc.nextInt();
  min=arr[0];
  max=arr[0];
    if(arr[i]<=min ){
   min=arr[i];
   }
   else if(arr[i]>max){
   max=arr[i];
     }
 }
 System.out.println("Smallest number is="+min);
 System.out.println("largest number is="+max); 
}
}
