package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum of Array Elements: "+sum);
		Arrays.sort(a);
		System.out.println("Sorted Array: ");
		for(int j:a) {
			System.out.print(j+", ");
		}
	}

}
