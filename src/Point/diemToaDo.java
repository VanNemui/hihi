package Point;

import java.util.Objects;

public class diemToaDo {
	private String tenDiem;
	private int hoanhDo;
	private int tungDo;

	/*
	 * Phuong thuc khoi tao nhan 1 xau ky tu va 2 so nguyen lam tham so
	 */
	public diemToaDo(String tenDiem, int hoanhDo, int tungDo) {
		this.tenDiem = tenDiem;
		this.hoanhDo = hoanhDo;
		this.tungDo = tungDo;
	}

	/*
	 * Phuong thuc khoi tao khong tham so hoanh do, tung do mac dinh la 0 ten diem
	 * mac dinh la: A
	 */
	public diemToaDo() {
		this.tenDiem = "A";
		this.hoanhDo = 0;
		this.tungDo = 0;
	}

	/*
	 * Phuong thuc khoi tao nhan hai so nguyen lam tham so ten diem mac dinh: A
	 */
	public diemToaDo(int a, int b) {
		this.tenDiem = "A";
		this.hoanhDo = a;
		this.tungDo = b;
	}

	public String getTenDiem() {
		return tenDiem;
	}

	public void setTenDiem(String tenDiem) {
		this.tenDiem = tenDiem;
	}

	public int getHoanhDo() {
		return hoanhDo;
	}

	public void setHoanhDo(int hoanhDo) {
		this.hoanhDo = hoanhDo;
	}

	public int getTungDo() {
		return tungDo;
	}

	public void setTungDo(int tungDo) {
		this.tungDo = tungDo;
	}

	public void nhapToaDo(int hDo, int tDo) {
		System.out.println("Hoanh Do sau khi thay doi: " + hDo);
		System.out.println("Tung Do sau khi thay doi: " + tDo);
		this.hoanhDo = hDo;
		this.tungDo = tDo;
	}

	public void inThongTinDiem() {
		System.out.println(this.tenDiem + "(" + this.hoanhDo + "," + this.tungDo + ")");
	}

	public boolean soSanhToaDoHaiDiem(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		diemToaDo other = (diemToaDo) obj;
		return this.hoanhDo == other.hoanhDo && this.tungDo == other.tungDo;
	}

}
