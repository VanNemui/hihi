package MayTinh;

public class SanXuat {
	private String tenHang;
	private quocGia QuocGia;
	
	public SanXuat(String tenHang, quocGia quocGia) {
		this.tenHang = tenHang;
		QuocGia = quocGia;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public quocGia getQuocGia() {
		return QuocGia;
	}

	public void setQuocGia(quocGia quocGia) {
		QuocGia = quocGia;
	}
	
}
