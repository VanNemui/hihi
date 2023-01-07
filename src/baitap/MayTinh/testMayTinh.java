package baitap.MayTinh;

public class testMayTinh {
	public static void main (String [] args) {
		quocGia q1 = new quocGia("ABC", "VIET NAM");
		quocGia q2 = new quocGia("XYZ", "NHAT BAN");
		quocGia q3 = new quocGia("MNB", "HAN QUOC");
		
		SanXuat s1 = new SanXuat("BamBoo", q1);
		SanXuat s2 = new SanXuat("Hatomugi", q2);
		SanXuat s3 = new SanXuat("Hada Labo", q3);
		
		Ngay n1 = new Ngay(11, 1, 2022);
		Ngay n2 = new Ngay(15, 1, 2022);
		Ngay n3 = new Ngay(11, 6, 2022);
		
		mayTinh m1 = new mayTinh(s3, n3, 123800, 6);
		mayTinh m2 = new mayTinh(s2, n1, 100800, 12);
		mayTinh m3 = new mayTinh(s1, n2, 103800, 18);
		
		System.out.println("So sanh mt 1 gia co nho hon mt 2 khum? " + m1.kiemTraGiaBanNhoHon(m2));
		System.out.println("So sanh mt 2 gia co nho hon mt 3 khum? " + m2.kiemTraGiaBanNhoHon(m3));
		
		System.out.println("Ten quoc gia cua mt 1 la: " + m1.tenQuocGia());
		System.out.println("Ten quoc gia cua mt 2 la: " + m2.tenQuocGia());
		System.out.println("Ten quoc gia cua mt 3 la: " + m3.tenQuocGia());
	}
}
