package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
//This has-> HashSet, LinkedHashSet and TreeSet which Implement Set Interface
	public static void main(String[] args) {
		Set<String> setObj=new HashSet<String>();//stores data in an unorderedformat. Stored based on the HashSet code
		setObj.add("No");
		setObj.add("Duplicate");
		setObj.add("elements");
		setObj.add("can be");
		setObj.add("Stored");	
		setObj.add("Unordered");
		System.out.println("Size of HashSet: "+setObj.size());
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
        System.out.print("Intersection of the two Set:"); 
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
        
        System.out.println("****************************************");
        
        Set<String> lhs=new LinkedHashSet<String>();//stores data in an orderedformat. based on the order of insertion
        lhs.add("Aplha");
        lhs.add("Beta");
        lhs.addAll(Arrays.asList(new String[] {"Charlie","Delta"}));
        lhs.add("Echo");
        
        System.out.println("Size of LinkedHashSet:"+lhs.size());
        System.out.println("Printing LinkedHashSet: "+lhs);
        
        lhs.remove("Delta"); //Removed the given object} And the below gives a boolean value while printing
        System.out.println("lhs set after removing"+lhs.remove("Delta")+lhs);
        
        //USing iterator now
        System.out.println("Using iterator to print LinkedHashSet below:");
        Iterator<String> it=lhs.iterator();
        while(it.hasNext()) {
        	System.out.print(it.next()+" ");
        }
        
        System.out.println();
        System.out.println("****************************************");
        
        Set<String> ts=new TreeSet<String>();//Stores in sorted format-In Ascending Order
        ts.add("Charlie");
        ts.add("Golf");
        ts.add("Foxtort");
        ts.addAll(Arrays.asList(new String[] {"Hotel","India"}));
        ts.add("Alpha");
        
        System.out.println("Size of TreeSet:"+ts.size());
        System.out.println("Printing TreeSet: "+ts);//stores in ascending order not based on ascending order
        System.out.println(ts.remove("Golf"));//if anything goes haywire with remove, it doesn't give an error
        System.out.println("Size after removal: "+ts.size());
        System.out.println("Printing TreeSet after removing an element: "+ts.remove("Glof")+ts);
	
        System.out.println("Printing using iterator");
        Iterator<String> t=ts.iterator();
        while(t.hasNext()) {
        	System.out.print(t.next()+" ");
        }
       
        System.out.println("\n");
        System.out.println("Printing using Enchanced  for loop");
        for(String s: ts) {
        	System.out.println(s);
        }
	}

}
