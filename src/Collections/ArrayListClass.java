package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		System.out.println();
		System.out.println("Using iterator to print below:");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println("Using for loop to print ArrayList below:");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+"-");
		}
		System.out.println("\n");
		ArrayList<Integer> ali=new ArrayList<Integer>();
		ali.add(5);
		ali.add(6);
		ali.add(1);
		ali.add(0);
		ali.add(4);
		System.out.println("Before sorting:"+ali);
		Collections.sort(ali);
		System.out.println("After sorting:"+ali);
		
	}

}
