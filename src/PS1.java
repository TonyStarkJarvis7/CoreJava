import org.testng.annotations.Test;

public class PS1 extends PS { //as this is inheriting from PS, all methods and functions of PS sit on top of child

	@Test
	public void testRun() {
		doThis(); // though this method is present in another class and in usual cases an obj
					// creation of that class would have been a must to access any methods of
					// that class. But, in this case as we have inherited the
					// methods and functionalities of that class into this one through the keyword extends, which
					// making this class a child class to the that class.
					//Therefore when we run the child class, all the methods of parent class also runs.
		System.out.println("-------------------------------------------");
		
		int a=3;
		PS2 ps2=new PS2(3); //cause sent during Object creation itself -----PARAMETERIZED CONSTRUCTOR
		/*System.out.println(ps2.increment(3)); //in this case we will have to parameterize the funtions in ps2
		System.out.println(ps2.decrement(3));*/ //but if we use the concept of constructors there wouldn't be
		// needing to pass the parameters everytime. 
		//We can send the value into the object creation step directly and let the constructor decide into which
		//function the value needs to be passed.
		
		System.out.println(ps2.increment());//In this case we don't need to send the values everytime because we sent 
		System.out.println(ps2.decrement());//it once already PS ps2=new PS2(3)
		
		
		//PS3 ps3=new PS3(3);
		//ps3.multiplyThree(3); these wouldn't work unless they are parameterized methods. Same as above
		//ps3.multiplyTwo(3);
		
		//If we want to access the methods of PS3 through PS2, we can extend PS2 to PS3 to inherit properties, 
		//methods and functions of PS3 into PS2
		//Due to the above, we will have to make PS2 constructor aware of PS3 constructor to check in PS3
		//with the help of 'super'keyword.
		
		//Now we can call the PS3 methods through PS2
		//we are now calling PS3 methods from PS2 through PS2 obj with the help of 'super' keyword placed at PS2 constructor and also through inheriting PS3
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
		
	}

}
