import java.util.Scanner;
class prime18{
public static void main(String[]args){
double num,temp=0;
System.out.println("Enter number");
Scanner p=new Scanner(System.in);
num=p.nextInt();
for(int i=2;i<=num-1;i++){
if(num%i==0){
temp=temp+1;
}
}
if(temp==0){
System.out.println(num+" is prime number");
}
else{
System.out.println(num+"is not a prime number");
}
}
}

