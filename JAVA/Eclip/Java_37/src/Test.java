
public class Test {
  public static void main(String[] args) {
	Ngay ngay1 = new Ngay(12, 2, 2011);
	Ngay ngay2 = new Ngay(5, 3, 2012);
	
	Lop lop1 = new Lop ("k21", "Tin");
	Lop lop2 = new Lop("k20", "Hoa");
	SinhVien sinhVien1 = new SinhVien("111111", "Duc", ngay1, 7.0, lop1);
	SinhVien sinhVien2 = new SinhVien("111222", "DucKhue", ngay2, 4.9, lop2);
	System.out.println("Ten Khoa "+sinhVien2.layTenKhoa());
	System.out.println("Dau of Rot : "+sinhVien2.kiemTraThiDau());
	System.out.println("Giong Hoac Khac "+sinhVien2.kiemTraCungNgaySinh(sinhVien1));
}
}
