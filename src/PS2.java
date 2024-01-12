
public class PS2 extends PS3{
	
	int a;                  //This is class variable and its scope is in the complete file
	
	public PS2(int i) {//TO pass values directly into the obj creation stage in PS1 we will have to use this constructor. 
		               // Also the value in this "instance variable" has a scope of only this block. 
		               //Therefore, it needs to be assigned to the class variable using 'this' keyword
		               //to achieve what we want to execute as below.
		super(i); //Parent class constructor is being invoked here. IN this case parent class here is PS3.
				 //Super must be the first line in "Child Constructor".
		this.a=i;         //We are assigning the received scope variable value to the class variable 
		
	}

	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;		
		return a;
	}
}
