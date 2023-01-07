package baitap.QuanLiSinhVien;

import java.util.Objects;

public class sinhvien {
	private int MSSV;
	private String HoVaTen;
	private Ngay ngaySinh;
	private double diemTrungBinh;
	private Lop lopHoc;
	
	public sinhvien(int mSSV, String hoVaTen, Ngay ngaySinh, double diemTrungBinh, Lop lopHoc) {
		MSSV = mSSV;
		HoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lopHoc = lopHoc;
	}

	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}

	public String getHoVaTen() {
		return HoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(Lop lopHoc) {
		this.lopHoc = lopHoc;
	}
	
	public void inTenKhoa() {
		String tenKhoa = this.lopHoc.getTenKhoa();
		System.out.println(tenKhoa);
	}
	
	public boolean kiemTraHocSinhDau() {
		return this.diemTrungBinh >= 6.5;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ngaySinh);
	}

	public boolean kiemTraNgaySinh(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhvien other = (sinhvien) obj;
		return Objects.equals(ngaySinh, other.ngaySinh);
	}
	
	
	
}
