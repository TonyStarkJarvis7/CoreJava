package InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		// ReverseDigits
		int num; //int ar[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		num=sc.nextInt();
		String reverseNumber=Integer.toString(num);
		System.out.println("Length of the: "+reverseNumber.length());
		
		char ch;
		int val=0;
		for(int i=reverseNumber.length()-1;i>=0;i--) {
			ch=reverseNumber.charAt(i);			
			System.out.print(Character.getNumericValue(ch));
			val=val+Character.getNumericValue(ch);		
		}
	System.out.println("Final reversed value is in variable val: "+val);
	}
	
}
