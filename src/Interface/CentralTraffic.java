package Interface;

public interface CentralTraffic {
	int a=4;//Every variable in an interface is considered to be of public access modifier unless explicitly defined 
	public void greenGo(); //Interfaces doesn't have method bodies
	public void redStop(); //All These are method implementations are mandatory where ever interface is implemented 
	public void flashYellow(); //THe code for these implementations is being written where ever these are implemented 
}
