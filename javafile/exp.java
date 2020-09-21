
class exp{
public static void main(String[]a){
int x=3;
int y=6;
int z=9;
y=x*x + 3*x -7;
System.out.println("y ="+y);

y=x++ + ++x;
System.out.println("y = "+y+"x = "+x);

z = x++ - --y - --x  +  x++;
System.out.println("y = "+y+"x = "+x+"z = "+z);



}
}
