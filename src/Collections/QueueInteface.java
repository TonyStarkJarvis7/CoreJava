package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInteface {

	public static void main(String[] args) {
		Queue<String> ll=new LinkedList<String>();//LinkedList
		ll.add("LL First");
		ll.add("Second");
		ll.add("Third");
		ll.add("fourth");
		ll.offer("offer - Fifth");//Adds an element to the rear of the queue 
		
		System.out.println("Size of llueue:"+ll.size());
		System.out.println(ll+"\n");
	
		System.out.println("Peeking Returns the element at the front/head of the LinkedList without removing it:"+ll.peek());
		System.out.println("offer(element): Adds an element to the rear of the LinkedList: "+ll+"\n");
		
		
		ll.remove();//Retrieves and removes the head/front of this llueue.		
		System.out.println("Size of llueue after removal:"+ll.size());
		System.out.println("Elements of llueue after removal at head: "+ll+"\n");
		
		//To iterate through the the Queue
		System.out.println("Using Iterator: ");
		Iterator<String> itl=ll.iterator();
		while(itl.hasNext())
			System.out.println(itl.next()); 
		
		System.out.println("********************************");
		
		Queue<String> pq=new PriorityQueue<String>(); 
		pq.add("Alpha");
		pq.add("Beta");
		pq.add("Charlie");
		System.out.println("Size of PriorityQueue: "+pq.size());
		System.out.println("Printing PriorityQueue Elements: "+pq);
		System.out.println("Head of Queue: "+pq.peek());
		
		pq.remove();//removes element at the head of the queue
		System.out.println("Size of PriorityQueue after removal: "+pq.size());
		System.out.println("Printing PriorityQueue Elements after removal: "+pq);
		
		pq.offer("offerGamma"); //Adds an element to the rear of the queue
		System.out.println("Size of PriorityQueue after 'offer': "+pq.size());
		System.out.println("Printing PriorityQueue Elements after 'offer': "+pq);
		
		System.out.println(pq.poll());//Retrieves and removes the head of this queue. This head is no more after this
		System.out.println("After poll:"+pq+" and size is: "+pq.size()+"\n");
		
		//To iterate through the the Queue
		System.out.print("Iterating using Iterator: ");
		Iterator<String> it=pq.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
