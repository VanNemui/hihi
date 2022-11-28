package RapChieuPhim;

public class hangSanXuat {
	private String tenHang;
	private String tenQuocGia;
	
	public hangSanXuat(String tenHang, String tenQuocGia) {
		this.tenHang = tenHang;
		this.tenQuocGia = tenQuocGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
}
