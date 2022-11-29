package week31;

public class testEqual {
	public static void main(String [] args) {
		hiEquals D1 = new hiEquals(2, 5, 2022);
		hiEquals D2 = new hiEquals(5, 10, 2023);
		hiEquals D3 = new hiEquals(2, 5, 2022);
		
		System.out.println(D1);
		System.out.println(D2);
		System.out.println("so sanh D1 va D2: " + D1.equals(D2));
		System.out.println("so sanh bang giua D1 va D3 " + D1.equals(D3));
	}

}
