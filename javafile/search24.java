import java.util.Scanner;
class Search24{
public static void main(String[]args){
int w,n,count=0;
Scanner sc=new Scanner (System.in);
System.out.println("Enter no to search in given array list");
w=sc.nextInt();
System.out.println("Enter number");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array element");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
if(w==a[i]){
//System.out.println("given saearch number is in given  array="+a[i]);
count++;
}
}
if(count>0){
System.out.println("Enter number "+w+" is in the array");}
else
System.out.println("Enter number "+w+" is in not the array");

}
}
