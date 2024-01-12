package InterviewQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void leapYearCheck(int year) {
		boolean leap;
		// if the year is divided by 4
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0) {
	        	leap = true;
	        }else {
	        	leap = false;
	        }	         
	      }else {
	    	  leap = true;
	      }       
	    }else {
	    	leap = false;
	    }
	    
	    if (leap)
	        System.out.println(year + " is a leap year.");
	      else
	        System.out.println(year + " is not a leap year.");
	    
	}
	
	public static void main(String[] args) {
		// Leap Year
		int year=0;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		leapYearCheck(year);
		}
}
