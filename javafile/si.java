
import java.util.Scanner;
class si{
public static void main(String[]args){

int p,r,t;
double si;
Scanner s = new Scanner(System.in);
System.out.println("Enter principle,rate of interest,time");
p=s.nextInt();
r=s.nextInt();
t=s.nextInt();
si=p*r*t;
System.out.println("simple interest is="+si+" per anum");

}
}
