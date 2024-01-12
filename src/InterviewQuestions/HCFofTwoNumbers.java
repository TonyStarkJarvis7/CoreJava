package InterviewQuestions;

import java.util.Scanner;

public class HCFofTwoNumbers {

	public static void main(String[] args) {
		// HCF of 2 numbers without recursion
		int m=0,n=0,ans;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter 2 numbers: ");
		m=sc.nextInt();
		n=sc.nextInt();
		while(m!=n){
			if(m>n) {
				m=m-n;
			}else {
				n=n-m;
			}
		}
		
		System.out.println("HCF of 2 numbers: "+m);
	}

}
