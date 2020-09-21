import java.util.Scanner;
class Revarray23{
public static void main(String[]args){

Scanner sc =new Scanner(System.in);
int n,temp=0;

System.out.println("Enter no");
 n=sc.nextInt();
 int a[]=new int[n];
System.out.println("Enter array element");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0,j=n-1;i<=j;i++,j--){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
for(int i=0;i<n;i++){
System.out.println("Reverse array is="+a[i]);}
}
}
