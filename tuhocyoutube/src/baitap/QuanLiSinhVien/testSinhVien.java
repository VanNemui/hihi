package QuanLiSinhVien;

public class testSinhVien {
	public static void main (String[]args) {
		Ngay n1 = new Ngay(4,9,2002);
		Ngay n2 = new Ngay(12,2,2022);
		Ngay n3 = new Ngay(12,12,2002);
		
		Lop l1 = new Lop("Cong nghe thong tin Viet Nhat" , "CNTT&TT");
		Lop l2 = new Lop("IT1" , "CNTT&TT");
		Lop l3 = new Lop("FL1" , "SOFL");
		
		sinhvien sv1 = new sinhvien(20205045, "Nguyen Anh Van", n1, 7.99 , l3);
		sinhvien sv2 = new sinhvien(20205046, "Nguyen Anh A", n2, 6.02 , l1);
		sinhvien sv3 = new sinhvien(20205047, "Nguyen Anh V", n3, 6.55, l2);
		sinhvien sv4 = new sinhvien(20205048, "Nguyen Anh V", n1, 6.55, l2);
		
		 sv1.inTenKhoa();
		 
		 System.out.println("Sinh vien 2 co dat dieu kien dau khong? " + sv2.kiemTraHocSinhDau());
		 System.out.println("Sinh vien 3 co dat dieu kien dau khong? " + sv3.kiemTraHocSinhDau());
		 
		 System.out.println("sinh vien 1 va sinh vien 2 co cung ngay sinh khong? " + sv1.kiemTraNgaySinh(sv2));
		 System.out.println("sinh vien 1 va sinh vien 4 co cung ngay sinh khong? " + sv1.kiemTraNgaySinh(sv4));
	}

}
