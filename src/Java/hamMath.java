package Java;

import java.util.Scanner;

public class hamMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so a: ");
		a = sc.nextDouble();

		System.out.println("Nhap so b: ");
		b = sc.nextDouble();

		// ham gia tri tuyet doi
		System.out.println("|a| = " + Math.abs(a));

		// ham tim min
		System.out.println("min(a,b) = " + Math.min(a, b));

		// ham tim max
		System.out.println("max(a,b) = " + Math.max(a, b));

		// ham ceil
		System.out.println(" ceil(a) = " + Math.ceil(a));

		// ham floor
		System.out.println(" floor(b) = " + Math.floor(b));

		// ham can bac hai
		System.out.println(" sqrt(a) = " + Math.sqrt(a));

		// ham pow
		System.out.println(" a^b = " + Math.pow(a, b));

		System.out.println("Ket thuc!!");

	}
}
