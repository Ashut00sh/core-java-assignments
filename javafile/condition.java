
import java.util.Scanner;
class condition{
public static void main(String[]args){
int x,y,z,r;
System.out.println("Enter any three numbers");
Scanner la=new Scanner(System.in);
x=la.nextInt();
y=la.nextInt();
z=la.nextInt();

  r = z > (x > y ? x : y) ? z : ((x > y) ? x : y);
  System.out.println("greatest number is="+r);

}
}
