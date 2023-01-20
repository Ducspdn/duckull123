
public class Test {
public static void main(String[] args) {
	Ngay ngay1  = new Ngay(1,1,2021);
	Ngay ngay2 = new Ngay(2,1,2022);
	Ngay ngay3 = new Ngay(4,1,2025);
	TacGia tacGia1 = new TacGia("Ducpro",ngay1);
	TacGia tacGia2 = new TacGia("Da2",ngay2);
	TenSach tenSach1 = new TenSach ("LapTrinh",500000,2019,tacGia1);
	TenSach tenSach2 =new TenSach("C++",400000,2011,tacGia2);
	tenSach1.inTenSach();
	tenSach2.inTenSach();
	// so sanh nam xuat ban 
	System.out.println("So Sanh tenSach1 && tenSach2 "+tenSach1.kiemTraCungNamXuatBan(tenSach2));
	System.out.println("tenSach1 sau khi giam gia "+tenSach1.giaSauKhiGiam(10));
	
}
}
