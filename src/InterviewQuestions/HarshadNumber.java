package InterviewQuestions;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=sc.nextInt();
		harshadNumber(n);

	}

	public static void harshadNumber(int num) {
		int digit, sum=0, temp=num;
		while(temp!=0) {//Sum of digits
			digit=temp%10;
			sum+=digit;
			temp=temp/10;
		}
		int hn=num/sum;
		System.out.println("harshadNumber is: "+hn);
	}
}
