package PhuongTien;

public class xeOto extends phuongTienDiChuyen{
	private String loaiNhienLieu;

	public xeOto(String loaiPhuongTien, HangSanXuat hangSX, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double vanToc() {
		return 100;
	}
	
}
