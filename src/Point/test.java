package Point;

public class test {
	public static void main(String[] args) {
		diemToaDo d1 = new diemToaDo("D", 4, 5);
		diemToaDo d2 = new diemToaDo("B", 2, 2);
		diemToaDo d3 = new diemToaDo("C", 4, 5);
		diemToaDo d4 = new diemToaDo();
		diemToaDo d5 = new diemToaDo(8, 2);
		
		d4.nhapToaDo(4, 4);
		d4.inThongTinDiem();
		
		System.out.println("Thong tin cac diem: ");
		d1.inThongTinDiem();
		d2.inThongTinDiem();
		d3.inThongTinDiem();
		d5.inThongTinDiem();
		d4.inThongTinDiem();
		
		System.out.println("Kiem tra hoanh do diem C va D co bang nhau khong?" 
							+ d1.soSanhToaDoHaiDiem(d3));
		System.out.println("Kiem tra hoanh do diem B va D co bang nhau khong?" 
				+ d2.soSanhToaDoHaiDiem(d3));
		
	}
}
