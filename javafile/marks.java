
import java.util.Scanner;
class per{
public static void main(String[]args){

int s1,s2,s3,s4,s5;
double sum,per;
Scanner a = new Scanner(System.in);
System.out.println("Enter five sub marks");
s1=a.nextInt();
s2=a.nextInt();
s3=a.nextInt();
s4=a.nextInt();
s5=a.nextInt();
sum=s1+s2+s3+s4+s5;
per=sum/5;

System.out.println("percentage marks =   "+" "+per+" "+"%");
System.out.println("Total marks marks =   "+" "+ sum);
}
}
