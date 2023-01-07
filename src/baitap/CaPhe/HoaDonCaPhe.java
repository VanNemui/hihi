package baitap.CaPhe;

public class HoaDonCaPhe {
	// khai bao thuoc tinh
	private String tenCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	// khai bao tao ra doi tuong
	// phuonf thuc constructor
	// luu y: ten trung voi ten class
	// khong co kieu tra ve
	public HoaDonCaPhe(String tenCaPhe, double giaTien1Kg, double khoiLuong) {
		this.tenCaPhe = tenCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}
	
	// khai bao phuong thuc
	public double tinhHoaDon() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	
	public boolean kiemTraKhoiLuong(double khoiLuongChoTruoc) {
		/*
		 * if(this.khoiLuong >= khoiLuongChoTruoc) return true; else return false;
		 */
		return this.khoiLuong > khoiLuongChoTruoc;
	}
	
	public boolean kiemTraGiaTien(double  giaTien) {
		/*
		 * if(this.tinhHoaDon() >= giaTien) return true; else return false;
		 */
		return this.tinhHoaDon() > giaTien;
	}
	
	public double giamGia() {
		if(this.tinhHoaDon() >= 500000) {
			System.out.println("So tien duoc giam: " + 0.1 * this.tinhHoaDon());
			return this.tinhHoaDon() - 0.1 * this.tinhHoaDon();
		}
		else return this.tinhHoaDon();
	}
	
}
