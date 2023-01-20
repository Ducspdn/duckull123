
public class BoPhim {
     private String tenPhim ;
     private int namSanXuat ;
     private HangSanXuat hangSanXuat ;
     private double giaVe ;
     private Ngay ngayChieu ;
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return this.tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return this.namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieu() {
		return this.ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public boolean kiemTraGiaVeBoPhim(BoPhim phimKhac)
	{
		return phimKhac.giaVe > this.giaVe ;
	}
	public String tenHang()
	
	{
		return this.hangSanXuat.gettenHangSanXuat();
	}
	public double giaSauKhiKhuyenMai(double x)
	{
		return this.giaVe *(1-x/100);
	}
	
     
}
