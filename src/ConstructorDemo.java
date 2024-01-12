
public class ConstructorDemo {

	public ConstructorDemo(){//COnstructor doesn't have a return type
		//This is the constructor and it would be executed first as soon as an obj of this class is
		//created.
		//WHen ever an obj is created a default/implicit constructor is invoked by the compiler whether or not
		// a constructor is  explicitly defined(as in this case).
		System.out.println("The control first goes to the constuctor");
	}
	
	public ConstructorDemo(int a, int b) {
		System.out.println("I'm in Parameterised Constructor");
	}
	
	public ConstructorDemo(String s) {
		System.out.println("I'm in Parameterised String Constructor. Value passed is : "+s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo(); //this initialization will invoke the constructor and execute it
		ConstructorDemo c = new  ConstructorDemo(2,3); //this now calls the parameterized constructor
		ConstructorDemo cs = new  ConstructorDemo("Alpha");
	}

}
