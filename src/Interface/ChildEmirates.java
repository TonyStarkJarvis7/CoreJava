package Interface;

public class ChildEmirates extends ParentAirCraft{

	public void audioSystem() {
		System.out.println("Function Overiding just took place-> Audio system child with same function name as Parent got executed ");
	}
	
	public void parentAudioSystem() {
		super.audioSystem();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ParentAirCraft pa= new ParentAirCraft();// We cannot instantiate obj for abstract classes!!
		ChildEmirates c=new ChildEmirates();
		c.safetyGuidelines();
		c.engine();
		c.bodyColour();
		c.audioSystem();//this will now access the local method due to function overriding otherwise it'll
		                 // access the function in the parent class.
		c.parentAudioSystem();
		
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("RedColour on the body");
	}

}
