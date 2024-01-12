import Interface.CentralTraffic;
import Interface.ContinentalTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{ //Multiple interfaces are implemented in this way through ','

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AustralianTraffic a = new AustralianTraffic(); // this means the object 'a' refers to the methods present in AustralianTraffic
		CentralTraffic a = new AustralianTraffic(); //here we created an obj 'a' which is an object of AustralianTraffic to implement the methods present in the Interface CentralTraffic
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
		AustralianTraffic at= new AustralianTraffic();
		at.walkOnSymbol();     //This method is local to this call. We need an object of this class to call
							  //methods of this class. The above obj refers to the methods of CentralTraffic methods and it cannot access mthods of this call
		
		ContinentalTraffic ct= new AustralianTraffic(); //New Obj is needed for new Interface so we created a new obj here
		ct.TrainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green GO");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow wait");
	}
	
	public void walkOnSymbol() {
		System.out.println("walking");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Executing a written code by writing a code in the Interface Implementation"
				+ "methods, since Interfaces doesn't have Method bodies");
	}
}
