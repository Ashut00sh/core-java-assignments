import java.util.Scanner;
class greate{
public static void main(String[]args){

int a,b,c;
Scanner lar=new Scanner(System.in);
System.out.println("Enter any three numbers");

a=lar.nextInt();
b=lar.nextInt();
c=lar.nextInt();
if(a>=b&&a>=c){
System.out.println("number "+a +" is greatest");
}
else if(b>=a&&b>=c){
System.out.println("number "+b+" is greatest");
}
else
System.out.println("number "+c+" is greatest");
}
}


