package InterviewQuestions;

import java.util.Scanner;

public class LogicSumOfDigits {

	public static void main(String[] args) {
		int num, digit, sum = 0;
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int rnum=num;
		while(num>0) {
			digit=num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("Sum of digits: "+sum);
		
		System.out.print("Reverse of the entered number: ");
		int remainder, reverse=0;
		while(rnum!=0) {
			remainder=rnum%10;
			reverse=reverse*10+remainder;
			rnum=rnum/10;
		}
		System.out.print(reverse);
	}

}
