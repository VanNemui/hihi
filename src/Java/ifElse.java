package Java;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so nguyen a: ");
		a = sc.nextInt();

		System.out.println("Nhap so nguyen b: ");
		b = sc.nextInt();

		// kiểm tra số chẵn lẻ
		if (a % 2 == 0)
			System.out.println("a la so chan");
		else
			System.out.println("a la so le");

		if (b % 2 == 0)
			System.out.println("b la so chan");
		else
			System.out.println("b la so le");
	}
}
