package Java;

import java.util.Scanner;

public class thapPhanSangNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so nguyen n>0: ");
		n = sc.nextInt();

		String nhiPhan = "";
		/*
		 * chia lien tuc cho 2 va lay phan du dao nguoc chuoi ket qua
		 * 
		 * vi du: so 10 10:2 du 0 5:2 du 1 2:2 du 0 1:2 du 1 -> nhi phan 1010
		 */
		while (n >= 1) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;
		}
		System.out.println("So nhi phan sau khi chuyen: " + nhiPhan);
	}
}
