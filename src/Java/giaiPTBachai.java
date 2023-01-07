package Java;

import java.util.Scanner;

public class giaiPTBachai {
	public static void main(String[] args) {
		double a, b, c, x;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap he so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap he so b: ");
		b = sc.nextDouble();
		System.out.println("Nhap he so c: ");
		c = sc.nextDouble();

		if (a == 0 && b == 0) {
			if (c == 0)
				System.out.println("Phuong trinh vo so nghiem!");
			else
				System.out.println("Phuong trinh vo nghiem!");
		} else if (a == 0 && b != 0) {
			x = -c / b;
			System.out.println("Phuong trinh co nghiem la: " + Math.round(x * 100) / 100.0);
		} else {
			double denta = Math.pow(b, 2) - 4 * a * c;
			if (denta < 0)
				System.out.println("Phuong trinh vo nghiem!");
			else if (denta == 0) {
				x = (-b) / 2 * a;
				System.out.println("Phuong trinh co nghiem kep: " + Math.round(x * 100) / 100.0);
			} else {
				x = ((-b + Math.sqrt(denta)) / (2 * a));
				System.out.println("Phuong trinh co hai nghiem:");
				System.out.println("Nghiem thu nhat: " + Math.round(x * 100) / 100.0);
				x = ((-b - Math.sqrt(denta)) / (2 * a));
				System.out.println("Nghiem thu hai: " + Math.round(x * 100) / 100.0);

			}
		}

	}
}
