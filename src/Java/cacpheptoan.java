package Java;

import java.util.Scanner;

public class cacpheptoan {
	public static void main(String[] args) {
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = sc.nextInt();

		System.out.println("Nhap so b: ");
		b = sc.nextInt();

		System.out.println(a + " + " + b + "= " + (a + b));
		System.out.println(a + " - " + b + "= " + (a - b));
		System.out.println(a + " * " + b + "= " + (a * b));
		System.out.println(a + " / " + b + "= " + (a / b));
		System.out.println(a + " % " + b + "= " + (a % b));

		System.out.println("Ket thuc!!!");
	}
}
