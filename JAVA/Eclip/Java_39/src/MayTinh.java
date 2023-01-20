
public class MayTinh {
  private HangSanXuat hangSanXuat ;
  private Ngay ngaySanXuat ;
  double giaBan ;
  double thoiGianBaoHanh ;
  // construter
public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
	
	this.hangSanXuat = hangSanXuat;
	this.ngaySanXuat = ngaySanXuat;
	this.giaBan = giaBan;
	this.thoiGianBaoHanh = thoiGianBaoHanh;
}
// get and set 
public HangSanXuat getHangSanXuat() {
	return hangSanXuat;
}
public void setHangSanXuat(HangSanXuat hangSanXuat) {
	this.hangSanXuat = hangSanXuat;
}
public Ngay getNgaySanXuat() {
	return ngaySanXuat;
}
public void setNgaySanXuat(Ngay ngaySanXuat) {
	this.ngaySanXuat = ngaySanXuat;
}
public double getGiaBan() {
	return giaBan;
}
public void setGiaBan(double giaBan) {
	this.giaBan = giaBan;
}
public double getThoiGianBaoHanh() {
	return thoiGianBaoHanh;
}
public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
	this.thoiGianBaoHanh = thoiGianBaoHanh;
}
public boolean  giaMayTinh (MayTinh mayTinhKhac)
{
	return this.giaBan < mayTinhKhac.giaBan ;
}
public String tenQuocGiaSanXuat()
{
	return this.hangSanXuat.layTen();
}
  
  
}
