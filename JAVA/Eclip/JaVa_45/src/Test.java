
public class Test {
 public static void main(String[] args) {
	 HangSanXuat h1 = new HangSanXuat("USA", "My");
	 HangSanXuat h2 = new HangSanXuat("UK", "ANh");
	 HangSanXuat h3 = new HangSanXuat("VN", "VietNam");
	 

	PhuongTienDiChuyen p1 = new MayBay(h3, "Azen");
	PhuongTienDiChuyen p2 = new XeDap(h2);
	System.out.println(p2.layTenHangSanXuat1());
	// muon dung phuong thuc may bay can tao 1 doi tuong cho lop may bay
	System.out.println(p2.layVanToc());
    MayBay p3 = new MayBay(h2, "azen");
    System.out.println(p3.getloaiPhuongTien()
	 );
}
}
