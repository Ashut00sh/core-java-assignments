import java.util.Scanner;
class leap14{
public static void main(String[]args){

int year;
System.out.println("Enter year ");
Scanner y =new Scanner(System.in);
year=y.nextInt();
if(year%4==0&&year%100==0&&year%400==0){
System.out.println(year+" Year is leap year");
}
else
System.out.println(year+" year is not a leap year");
}
}
