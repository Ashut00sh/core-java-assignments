package samplequestions;
import java.util.Scanner;
class prime implements Runnable {
	public void run() {
		int ct=0;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=2;i<1000;i++) {
			for(int j=0;j<a;j++) {
				if(a%2==0) {
					ct++;
					break;
				}
			
			}
		}
		sc.close();
		if(ct==0) {
			System.out.println("no is"+a+" prime");
		}else {
			System.out.println("given no"+a+"not prime");
		}
	}
}
public class Q62 {

	public static void main(String[] args) {
		
			prime p=new prime();
			Thread t=new Thread(p);
			t.start();
	}

}
