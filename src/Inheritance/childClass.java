package Inheritance;

public class childClass extends parentClass{

	String colour="Green";
	int a=3;
	public childClass() {
		super(); //This invokes the constructor of the parent class here. when we want to invoke the parent constructor, this should always be the first line 
		System.out.println("Constructor of childClass");
	}
	
	public void engine() {
		System.out.println("New engine implemented");
	}
	
	public void colour() {
		System.out.println("Colour of child class: "+colour);//here colour variable is defined in parentclass and we are 
										//accessing it directly due to inheritance only when there is no variable with the same name //in the local class 
		System.out.println("To print the value of the colour variable of the parent class while there "
				+ "is a variable of the same name in the child class also. TO EXECUTE THIS WE USE"
				+ "THE KEYWORD SUPER. The value of colour in the parent class is: "+super.colour);							
		
	}
	
	public void getData() {
		super.getData();  //we called the getData of the parent class through super keyword due to same method names
		System.out.println("This is getData of child class");
		int a=10;
		System.out.println(a); //prints local variable value
		System.out.println(this.a); //prints global variable value of the same variable
		int sum=a+this.a;  //prints Sum of global variable and local variable
		System.out.println("Sum of global variable and local variable: "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClass cc=new childClass();
		cc.colour();
		cc.brakes();//accessing methods of Parent class also due to inheritance 
		
		cc.getData(); //this access the local class by overriding the same method(of same name) in the parent class
					//To access the mthod in the parent class of the same name we need the word super
					//check the local child class getData method where we called the getData of parent clas
					//through the keyword super
	}	

}
