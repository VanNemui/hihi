package PhuongTien;

public class testPT {
	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hang 1", "Nhat Ban");
		HangSanXuat h2 = new HangSanXuat("Hang 2", "Viet Nam");
		HangSanXuat h3 = new HangSanXuat("Hang 3", "trung Quoc");
		
		phuongTienDiChuyen p1 = new mayBay("may bay", h3, "Than");
		phuongTienDiChuyen p2 = new mayBay("may bay", h1, "khi dot");
		phuongTienDiChuyen p3 = new xeOto("o to", h3, "xang");
		phuongTienDiChuyen p4 = new xeOto("o to", h2, "Dau");
		
		System.out.println("In ten hang cua cac phuong tien: ");
		System.out.println(p1.layTenHangSX());
		
		
	}
}