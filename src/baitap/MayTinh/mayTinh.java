package baitap.MayTinh;

public class mayTinh {
	private SanXuat hangSanXuat;
	private Ngay ngaySanXuat;
	private double giaBano;
	private int thoiGianBaoHanh;
	
	public mayTinh(SanXuat hangSanXuat, Ngay ngaySanXuat, double giaBano, int thoiGianBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBano = giaBano;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public SanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(SanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public Ngay getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBano() {
		return giaBano;
	}

	public void setGiaBano(double giaBano) {
		this.giaBano = giaBano;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public boolean kiemTraGiaBanNhoHon(mayTinh MTKhac) {
		return this.giaBano <= MTKhac.giaBano;
	}
	
	public String tenQuocGia() {
		return this.hangSanXuat.getQuocGia().getTenQuocGia();
	}
}
