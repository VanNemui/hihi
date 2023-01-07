package Java;

import java.util.Scanner;

public class giaPTbacNhat {
	public static void main(String[] args) {
		int a, b;
		double x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so nguyen a: ");
		a = sc.nextInt();

		System.out.println("Nhap so nguyen b: ");
		b = sc.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem!");
			} else
				System.out.println("Phuong trinh vo nghiem!");
		} else {
			x = (double) -b / a;
			System.out.println(x);
			System.out.println("Phuong trinh co nghiem: " + Math.round(x * 100) / 100.0);
		}
	}
}
