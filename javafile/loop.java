
class loop{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
System.out.print("" +j);
if(j==3)
break outer;
}


System.out.println(i);
}
}
}
