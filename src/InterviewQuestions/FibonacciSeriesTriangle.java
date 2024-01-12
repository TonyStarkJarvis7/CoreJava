package InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeriesTriangle {

	public static void main(String[] args) {
		// FibonacciSeriesTriangle
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number if Rows: ");
		rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			int n1=0,n2=1;
			for(int j=1;j<=i;j++) {
				int n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
			System.out.println("Space");
		}
	}

}
