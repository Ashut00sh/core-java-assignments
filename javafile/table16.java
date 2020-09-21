import java.util.Scanner;
class table16{
public static void main(String[]args){

int num;
System.out.println("enter number to get table of it");
Scanner sc=new Scanner (System.in);
num=sc.nextInt();
for(int i=1; i<=10; i++){
 
 System.out.println(num*i);
}

}
}
