package PhuongTien;

public abstract class phuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSX;
	
	public phuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSX) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSX = hangSX;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}
	 public String layTenHangSX() {
		 return this.hangSX.getTenHang();
	 }
	 
	 public void khoiDong() {
		 System.out.println("hihi");
	 }
	 public void tangToc() {
		 System.out.println("haha");
	 }
	 public void tatMay() {
		 System.out.println("hoho");
	 }
	 public abstract double vanToc();
	 
}
