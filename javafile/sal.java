import java.util.Scanner;
class sal{
public static void main(String[]args){

double sal,basic,da,gross,hra;
System.out.println("Enter salary");
Scanner sa= new Scanner(System.in);
sal = sa.nextDouble();
if(sal < 10000)
{
hra=0.1*sal;
da=0.9*sal;
gross=sal+hra+da;

System.out.println("gross salary =="+gross);
}
else{
hra=2000;
da=0.98*sal;
gross=sal+da+hra;
System.out.println("gross salary=="+gross);
}
}
}
