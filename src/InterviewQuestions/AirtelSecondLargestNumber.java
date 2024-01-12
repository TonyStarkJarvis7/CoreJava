package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AirtelSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfNumbers;
		System.out.println("Enter the number values you want to enter: ");
		Scanner sc=new Scanner(System.in);
		noOfNumbers=sc.nextInt();
		int ar[]=new int[noOfNumbers];
		//ArrayList a=new ArrayList();
		for(int i=0;i<noOfNumbers;i++) {
			System.out.print("Enter the "+i+" th value: ");
			ar[i]=sc.nextInt();
		}
		System.out.println("You entered: "+ar.length+" values");

		Arrays.sort(ar);//Sorting the array in ascending order using Arrays.sort(<arrayName>)
		for(int i=0;i<noOfNumbers;i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println();
		System.out.println("SecondBiggest: "+ar[ar.length-2]);
		int biggest=0;
		for(int i=0;i<noOfNumbers;i++) {
			if(biggest<ar[i]) {
				biggest=ar[i];
			}
		}
		System.out.println("Biggest: "+biggest);
	}
	

	
}
