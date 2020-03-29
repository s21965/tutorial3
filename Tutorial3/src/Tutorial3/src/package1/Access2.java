package package1;

import package2.Access3;

public class Access2 {
	
	public static void main(String[] args) {
		
		
		Access1 a = new Access1 (); 
		System.out.println(a.power);
		System.out.println(a.brand);
		System.out.println(a.productionYear);
		System.out.println(a.seats);
		
		
		Access3 b = new Access3 (); 
		System.out.println(a.power);
		System.out.println(a.brand);
		System.out.println(a.productionYear);
		System.out.println(a.seats);
		
	}

}
