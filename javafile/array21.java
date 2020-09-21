import java.util.Scanner;
class array21{
public static void main(String[]args){
int arr[]=new int[10];
int sum=0;
System.out.println("Enter Elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++){

arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println("Total of all element is="+sum);
float avg=sum/arr.length;
System.out.println("average is ="+avg);
}
}
