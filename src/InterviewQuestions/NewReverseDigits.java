package InterviewQuestions;

import java.util.Scanner;

public class NewReverseDigits {

	public static void main(String[] args) {//input 45631  //output 13654 = sum
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		String number=Integer.toString(num);
		
		StringBuffer sb= new StringBuffer(number);
		System.out.println("Reverse of entered number: "+sb.reverse());
		
		String ar[]=number.split("");
		
		int sum=0;
		for(String a: ar) {
			sum+=Integer.parseInt(a);
		}
		System.out.println("Sum of Digits: "+sum);
	}

}
