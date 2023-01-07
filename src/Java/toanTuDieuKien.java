package Java;

import java.util.Scanner;

public class toanTuDieuKien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so nguyen a: ");
		int a = sc.nextInt();

		String ketQua = (a % 2 == 0) ? "So nguyen a la so chan!" : "So nguyen a la so le!";
		System.out.println(ketQua);

		System.out.println("Ket thuc !!!");
	}
}
