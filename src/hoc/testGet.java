package week31;

public class testGet {
	public static void main (String []args) {
		getAndSet gs = new getAndSet(4,9,2002);
		System.out.println("Month: " + gs.getMonth());
		gs.setMonth(12);
		System.out.println("Month: " + gs.getMonth());
		gs.setMonth(24);
		System.out.println("Month: " + gs.getMonth()
		);
	}
	
}
