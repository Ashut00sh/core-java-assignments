import java.util.Scanner;
class temp{
public static void main(String[]arg){
float fah;
float cel;
System.out.println("enter ttemp in fahrenheit");
Scanner t= new Scanner(System.in);
fah=t.nextInt();
cel=5*((fah-32)/9);
System.out.println("Temperature in celcious=="+cel); 
}
}
