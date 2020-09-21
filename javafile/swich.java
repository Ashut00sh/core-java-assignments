import java.util.Scanner;
class swich{
public static void main(String[]aaregs){

Scanner sc=new Scanner(System.in);
System.out.println("enter any day no");
byte dayno=sc.nextByte();

switch(dayno){
case 1:
System.out.println("mon");
break ;
case 5:
System.out.println("friday");
break ;
case 2:
System.out.println("tues");
break ;
case 3:
System.out.println("wednes");
break ;
case 4:
System.out.println("thurs");
break ;
case 6:
System.out.println("sat");
break ;
case 7:
System.out.println("sun");
break ;
default :
System.out.println("not a day name");
}
}
}
