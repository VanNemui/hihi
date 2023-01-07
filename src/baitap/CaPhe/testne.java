package baitap.CaPhe;

public class testne {
	public static void main (String [] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Anh Van", 30000, 5);
		System.out.println("Tong tien: " + hd.tinhHoaDon() + "VND");
		
		System.out.println("hihi  " + hd.kiemTraKhoiLuong(2));
		System.out.println("haha " + hd.kiemTraGiaTien(500000));
		System.out.println("Gia tien: " + hd.giamGia());
	}

}
