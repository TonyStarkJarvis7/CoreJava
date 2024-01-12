
public class staticVar {

	String name;   //Instance variable -because the values change as per the current instance/object
	String address;
	static String city="Chennai"; //Class variable-the value is accessible throughout the class 
	static int i=0; //sharing will happen rather than separate instances
	
	//a static block can also be made for all the static variables in the following way
	/*static {
		city="Delhi";
		i=5;
	}*/
	
	staticVar(String name,String address){
		this.name=name;   //Local variables
		this.address=address;
		i++; //after the 1st execution the 2nd obj is being executed which continues the increment
		System.out.print(i+". ");
	}
	
	public void getAddress() {
		System.out.println(address+" - "+city);
	}
	
	public static void getCity() {
		//static methods only accept static variables!!
		//System.out.println(name); is not possible name is not static
		System.out.println(city); //this is possible because city is static
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar obj=new staticVar("Aplha","Nandambakkam");
		obj.getAddress();

		staticVar obj1=new staticVar("Beta","Airport");		
		obj1.getAddress();
		obj.address="XYZ";
		
		getCity();
		//OR ANY OF THESE WAYS OF CALLING A STATIC METHOD IS FINE
		staticVar.getCity();
		
		i=4; /*or*/ staticVar.i=5; //Runtime assigning of variable
	}

}
