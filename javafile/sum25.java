
import java.util.Scanner;
class Sum25{
public static void main(String[]args){
int n,sume=0,sumodd=0;
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array element");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
if(a[i]%2==0){
sume=sume+a[i];
}
else{
sumodd=sumodd+a[i];
}
}
System.out.println("Sum of even number is ="+sume);
System.out.println("Sum of odd number is ="+sumodd);
}
}
