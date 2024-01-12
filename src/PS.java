import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method from PS");
	}
	
	@Test
	public void doThis() {
		System.out.println("do this from PS");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method from PS");
		
	}
}
