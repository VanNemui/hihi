package Java;

import java.util.Scanner;

public class hinhTron {
	public static void main(String[] args) {
		double r, dienTich, chuVi, theTich;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ban kinh cua hinh tron: ");
		r = sc.nextDouble();

		// math.round: lam tron so nguyen
		dienTich = Math.PI * Math.pow(r, 2);
		System.out.println("Dien tich hinh tron la: " + Math.round(dienTich * 100.0) / 100.0 + "(don vi dien tich)");

		chuVi = 2 * Math.PI * r;
		System.out.println("Chu vi hinh tron: " + Math.round(chuVi * 100.0) / 100.0 + "(don vi do dai)");

		theTich = (double) (4 / 3) * Math.PI * Math.pow(r, 3);
		System.out.println("The tich hinh tron: " + Math.round(theTich * 100.0) / 100.0 + "(don vi the tich)");

		System.out.println("Ket thuc !!!");
	}
}
