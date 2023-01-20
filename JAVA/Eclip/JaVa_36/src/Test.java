
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 05, 2022);
		Ngay ngay2 = new Ngay(31, 01, 2025);
		Ngay ngay3 = new Ngay(16, 02, 2030);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng B", "Mỹ");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hãng C", "Ba Lan");
		
		BoPhim boPhim1 = new BoPhim("Bo", 2021, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("BOSSS", 2022, hangSanXuat2, 30000, ngay2);
		BoPhim boPhim3 = new BoPhim("Bo1", 2023, hangSanXuat3, 40000, ngay3);
		
		
		System.out.println("Kiem Tra Gia Ve " + boPhim1.kiemTraGiaVeBoPhim(boPhim2) );
		System.out.println("Hang Ten Phim "+boPhim1.tenHang());
		System.out.println("Gia Sau Khuyen Mai "+boPhim2.giaSauKhiKhuyenMai(10));
	
}
}
