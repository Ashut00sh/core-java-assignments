import java.util.Scanner;

class eligible{
public static void main(String[]args){
char gender;
int age;
Scanner a = new Scanner(System.in);
System.out.println("enter gender and age");

gender=a.next().charAt(0);
age=a.nextInt();
if(age>=21){
System.out.println("You area eligible for marriage");
}
else
System.out.println("You are not eligible for marriage");
}
}
