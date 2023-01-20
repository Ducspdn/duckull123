
public class HangSanXuat {
     private String tenHangSanXuat ;
     private String tenQuocGia ;
     public HangSanXuat(String tenHangSanXuat, String tenQuocGia)
     {
    	 this.tenHangSanXuat = tenHangSanXuat ;
    	 this.tenQuocGia = tenQuocGia ;
     }
     // get and set 
     public String getHangSanXuat()
     {
  	   return this.tenHangSanXuat ;
     }
     public void setHangSanXuat(String tenHangSanXuat)
     {
  	   this.tenHangSanXuat = tenHangSanXuat ;
     
     }
	

	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
     
}
