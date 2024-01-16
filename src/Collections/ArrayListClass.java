package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Zero");
		al.add("Two");
		al.add("Three");
		al.add("Fourth");
		System.out.println(al);
		
		al.add(1, "One");//Inserts the specified element at the specified position in thislist
		System.out.println("After adding element at 1st index: "+al);
		
		al.set(3, "Replaced");//Replaces the element at the specified position in this list with the specified element.
		System.out.println("After replacing element: "+al);
		
		al.remove(3);//Removes the element at the specified position in this list.
		System.out.println("After removing element: "+al+"\n");
		
		System.out.println("PRinting ArrayList using enhanced forLoop");
		for(String s:al) {
			System.out.print(s+" ");
		}
		
		Iterator<String> it=al.iterator();
		
	}

}
