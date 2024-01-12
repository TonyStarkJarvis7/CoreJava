import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		System.out.println("1. "+d.toString());
		
		SimpleDateFormat sdf1=new SimpleDateFormat();//No Argument so we get date and time when called
		System.out.println("2. "+sdf1.format(d));
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); //Capital MM is Important her to her the correct month
		System.out.println("3. "+sdf.format(d));
		System.out.println("4. "+d.toString());
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("5. "+sdf2.format(d));
	}

}
