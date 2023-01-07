package baitap.RapChieuPhim;

public class test {
	public static void main (String [] args) {
		Ngay n1 = new Ngay(23, 12, 2022);
		Ngay n2 = new Ngay(23, 1, 2022);
		Ngay n3 = new Ngay(23, 2, 2022);
		
		hangSanXuat h1 = new hangSanXuat("hehe" , "Han quoc");
		hangSanXuat h2 = new hangSanXuat("huhu" , "Viet Nam");
		hangSanXuat h3 = new hangSanXuat("hoho" , "Trung Quoc");
		
		BoPhim b1 = new BoPhim("blabla" , 2020, h1, 80000, n1);
		BoPhim b2 = new BoPhim("blublu" , 2022, h2, 100000, n2);
		BoPhim b3 = new BoPhim("blibli" , 2020, h3, 70000, n3);
		
		System.out.println("Gia ve cua phim 1 co nho hon gia ve phim 3: " + b1.kiemTraGiaVe(b3));
		
		System.out.println(b1.inTenHang());
		System.out.println(b2.inTenHang());
		System.out.println(b3.inTenHang());
		
		System.out.println("Gia ve phim 1 khi co khuyen mai la: " + b1.giaVeKhiKhuyenMai(10));
	}
}
