package Java;

import java.util.Scanner;

public class soNgayCua1Thang {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap thang can kiem tra: ");
		n = sc.nextInt();

		switch (n) {
		case 1: {
			System.out.println("Thang 1 co 31 ngay!");
			break;
		}
		case 3: {
			System.out.println("Thang 3 co 31 ngay!");
			break;
		}
		case 5: {
			System.out.println("Thang 5 co 31 ngay!");
			break;
		}
		case 7: {
			System.out.println("Thang 7 co 31 ngay!");
			break;
		}

		case 8: {
			System.out.println("Thang 8 co 31 ngay!");
			break;
		}
		case 10: {
			System.out.println("Thang 10 co 31 ngay!");
			break;
		}
		case 12: {
			System.out.println("Thang 12 co 31 ngay!");
			break;
		}
		case 4: {
			System.out.println("Thang " + n + " co 30 ngay!");
			break;
		}
		case 6: {
			System.out.println("Thang " + n + " co 30 ngay!");
			break;
		}
		case 9: {
			System.out.println("Thang " + n + " co 30 ngay!");
			break;
		}
		case 11: {
			System.out.println("Thang " + n + " co 30 ngay!");
			break;
		}
		case 2: {
			System.out.println("Nhap nam : ");
			int nam = sc.nextInt();
			if (nam % 4 == 0)
				System.out.println("Thang " + n + " co 29 ngay!");
			else
				System.out.println("Thang 2 co 28 ngay!");
			break;
		}

		default:
			System.out.println("Thang nhap bi sai!");
		}
	}
}
