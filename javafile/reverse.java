import java.util.Scanner;
class reverse{
static public void main(String[]args){
int num,rev=0;
System.out.println("Enter number ");
Scanner n=new Scanner(System.in);
num=n.nextInt();
while(num!=0){
int z=num%10;
rev=rev*10+z;
num=num/10;
}
System.out.println("reverse of given number is = "+rev);
}
}
