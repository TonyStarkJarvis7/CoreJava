
public class separate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=0;i<4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print(n+" ");
				System.out.print("\t");
				n++;
			}
			System.out.println(" ");
		}
		
		System.out.println("	2 Other way of printing it----------------------");
		int k=1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		System.out.println("	3 Other question of printing it----------------------");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
	
		System.out.println("	4. ->3's Question of printing it----------------------");
		int g=3, c=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(g*c);
				System.out.print("\t");
				c++;
			}
			System.out.println("");
		}
		
	}

}
