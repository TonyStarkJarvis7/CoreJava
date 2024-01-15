package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> setObj=new HashSet<String>();
		setObj.add("No");
		setObj.add("Duplicate");
		setObj.add("elements");
		setObj.add("can be");
		setObj.add("Stored");	
		setObj.add("Unordered");
		System.out.println(setObj);
	
		Set<String> setObj2=new HashSet<String>();
		setObj2.addAll(Arrays.asList(new String[] {"Stores in","Unordered","Format"}));
		System.out.println(setObj2);
		
		// To find union 
        Set<String> union = new HashSet<String>(setObj); //passing first array
        union.addAll(setObj2);                           //passing second array
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<String> intersection = new HashSet<String>(setObj); //passing first array
        intersection.retainAll(setObj2);                        //passing second array
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<String> difference = new HashSet<String>(setObj);  //passing first array
        difference.removeAll(setObj2);                         //passing second array
        System.out.print("Difference of the two Set"); 
        System.out.println(difference);
        
        System.out.println("Iterating over set: ");
        
        //using Iterator on Set
        Iterator<String> i=setObj.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
	}

}
