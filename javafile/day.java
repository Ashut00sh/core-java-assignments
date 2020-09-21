import java.util.Scanner;

class day{
public static void main(String[]args){

System.out.println("Enter number of days");
int days;
double year,month,week;
Scanner z= new Scanner(System.in);
days= z.nextInt();

year=days/365;
month=days/30;
week=days/7;
System.out.println("year = "+year+" "+"months = "+month+" "+"weeeks = "+week);


}
}
