
public class HangSanXuat {
  private String tenHangSanXuat ;
  private QuocGia quocGia ;
  // constructer
  public HangSanXuat(String tenHangSanXuat , QuocGia quocGia)
  {
	  this.tenHangSanXuat = tenHangSanXuat ;
	  this.quocGia = quocGia ;
  }
  // get and set 
public String getTenHangSanXuat() {
	return tenHangSanXuat;
}
public void setTenHangSanXuat(String tenHangSanXuat) {
	this.tenHangSanXuat = tenHangSanXuat;
}
public QuocGia getQuocGia() {
	return quocGia;
}
public void setQuocGia(QuocGia quocGia) {
	this.quocGia = quocGia;
}
  public String layTen()
  {
	  return this.quocGia.getTenQuocGia();
  }
}
