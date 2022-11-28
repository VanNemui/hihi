package RapChieuPhim;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private hangSanXuat hang;
	private double giaVe;
	private Ngay ngayChieu;
	
	public BoPhim(String tenPhim, int namSanXuat, hangSanXuat hang, double giaVe, Ngay ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hang = hang;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public hangSanXuat getHang() {
		return hang;
	}

	public void setHang(hangSanXuat hang) {
		this.hang = hang;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean kiemTraGiaVe(BoPhim PhimKhac) {
		return this.giaVe < PhimKhac.giaVe;
	}
	
	public String inTenHang() {
		return this.hang.getTenHang();
	}
	
	public double giaVeKhiKhuyenMai(int phanTram) {
		return this.giaVe - this.giaVe * phanTram /100;
	}
}
