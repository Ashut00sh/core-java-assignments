import java.util.Scanner;
class prime20{
public static void main(String[]args){
int start,end,temp=0;
System.out.println("Enter start range ");
Scanner p=new Scanner(System.in);
start=p.nextInt();
System.out.println("Enter end range ");
end=p.nextInt();
for(int i=start+1; i<end; i++){
temp=0;
for(int j=2; j<i; j++){
if(i%j==0){
temp=temp+1;
break;
}

}
if(temp==0){
System.out.println("prime numbers are ="+i);

}

}
}
}
