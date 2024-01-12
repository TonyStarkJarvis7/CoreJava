package Interface;

public abstract class ParentAirCraft {

	public void engine() {
		System.out.println("Follow engine guidlines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow safety guidlines");
	}
	
	public void audioSystem() {
		System.out.println("ParentAirCraft class audiosystem");
	}
	
	public abstract void bodyColour();
		
}
