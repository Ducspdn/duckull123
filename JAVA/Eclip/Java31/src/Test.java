
public class Test {
     public static void main(String[] args) {
		HoaDonCafe mp = new HoaDonCafe("Trung Nguyen",100000,7);
		HoaDonCafe mp2 = new HoaDonCafe("Trung Nguyen",100000,3);
		System.out.println(mp.tinhTongtien());
		System.out.println("Kiem Tra Lon Hon 2 "+mp.kiemTraKhoiLuongLonHon(3));
		System.out.println("Kiem Tra Nho Hon 2 "+mp.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem Tra Hoa Don "+mp.kiemTra());
		System.out.println("Giam Gia "+mp.giamGia(10));
		System.out.println("Gia Gia "+mp2.giamGia(10));
		System.out.println("So Tien Phai Tra "+mp.soTienTra(10));
		
	}
}
