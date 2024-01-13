package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		primeCheck(num);
		
	}

	public static void primeCheck(int num) {
		if(num<2) {
			System.out.println("The entered number:"+num+" is not a prime number");
		}else {
			int count=0;
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					count++;					
				}
			}
			if(count>=2) {
				System.out.println("Not a prime");
			}else {
				System.out.println("Prime");
			}
		}
	}
	
}
