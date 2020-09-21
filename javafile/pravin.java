import java.util.Scanner;
class pravin{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Start numbers ");
     int start=sc.nextInt();
     System.out.println("Enter a End numbers ");
     int end=sc.nextInt();
     int count=0;
     for(int i=(start+1);i<end;i++){
           count=0;
          for(int j=2;j<i;j++){
 // System.out.println("a"+i+" "+count);
               if(i%j==0){
                    count++;
                      break;
                  }
            }
          if(count==0){
            System.out.println(i);    
           }
       }

   }
}
