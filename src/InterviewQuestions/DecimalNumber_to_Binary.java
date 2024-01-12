package InterviewQuestions;

import java.util.Scanner;

public class DecimalNumber_to_Binary {

	public static void main(String[] args) {
		// DecimalNumber to Binary
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer to find its Binary: ");
		n=sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
	}

}
