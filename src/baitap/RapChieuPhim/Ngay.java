package baitap.RapChieuPhim;

public class Ngay {
	private int Ngay;
	private int Thang;
	private int Nam;
	
	public Ngay(int ngay, int thang, int nam) {
		Ngay = ngay;
		Thang = thang;
		Nam = nam;
	}

	public int getNgay() {
		return Ngay;
	}

	public void setNgay(int ngay) {
		Ngay = ngay;
	}

	public int getThang() {
		return Thang;
	}

	public void setThang(int thang) {
		Thang = thang;
	}

	public int getNam() {
		return Nam;
	}

	public void setNam(int nam) {
		Nam = nam;
	}

}
