package PhuongTien;

public class mayBay extends phuongTienDiChuyen{
	private String loaiNhienLieu;

	public mayBay(String loaiPhuongTien, HangSanXuat hangSX, String loaiNhienLieu) {
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
		return 400;
	}
	
	public void catCanh() {
		System.out.println("Bay ne");
	}
	
	public void haCanh() {
		System.out.println("Ha canh ne");
	}
}
