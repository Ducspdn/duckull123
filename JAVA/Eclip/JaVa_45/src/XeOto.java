
public class XeOto extends PhuongTienDiChuyen {
     private String loaiNhienLieu; 
     public XeOto (HangSanXuat hangSanXuat , String loaiNhienLieu)
     {
    	 super("oto",hangSanXuat);
    	 this.loaiNhienLieu = loaiNhienLieu ;
     }
     // get and set 
     public String getloaiNhienLieu()
     {
    	 
    	 return this.loaiNhienLieu ;
     }
     public void setloaiNhienLieu(String loaiNhienLieu)
     {
    	 this.loaiNhienLieu = loaiNhienLieu ;
     }
     public double layVanToc()
     {
    	 return 250 ;
     }
     
}
