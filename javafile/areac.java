
import java.util.Scanner;
class areac{
public static void main(String[]a ){
int rad;
double area, circum;
Scanner s = new Scanner(System.in);
System.out.println("Enter Radius");

rad =s.nextInt();

area=3.14*(rad*rad);
System.out.println("area of circle = " + area);
circum=2*3.14*(rad);
System.out.println("circumference of circle is = "+circum);

}
}
