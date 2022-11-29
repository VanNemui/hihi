package week31;

public class TestSach {
	public static void main (String [] args) {
		NgaySinh n1 = new NgaySinh(12, 3, 2000);
		NgaySinh n3 = new NgaySinh(1, 5, 2000);
		NgaySinh n2 = new NgaySinh(12, 9, 1999);
		
		TacGia t1 = new TacGia("Nguyen Nhat Anh", n1);
		TacGia t2 = new TacGia("Nguyen Van hihi", n2);
		TacGia t3 = new TacGia("Nguyen Nhat hoho", n3);
		
		Sach s1 = new Sach("hehe", 132750, 2020, t1);
		Sach s2 = new Sach("haha", 101000, 2021, t2);
		Sach s3 = new Sach("kaka", 146970, 2019, t3);
		
		s1.inTenSach();
		s2.inTenSach();
		s3.inTenSach();
		
		System.out.println("Sach 1 va Sach 3 co cung nam xuat ban khong? " + s1.kiemTraNamXuatBan(s3));		
		
		System.out.println("Gia sach 1 sau khi giam: " + s1.giaSachSauGiam(8) + " VND");
	}
}
