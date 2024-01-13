package InterviewQuestions;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("Sum of N natural nmbers: "+sum);

	}

}
