
public class MayBay extends PhuongTienDiChuyen {
   private String loaiNhienLieu;
   public MayBay (HangSanXuat hangSanXuat,String LoaiNhienLieu)
   {
	   super("MayBay", hangSanXuat);
	   this.loaiNhienLieu = loaiNhienLieu ;
   }
   // get ad set 
   public String getloaiNhienLieu()
   {
	   return this.loaiNhienLieu ;
   }
   public void setloaiNhienLieu(String loaiNhienLieu)
   {
	   this.loaiNhienLieu = loaiNhienLieu ;
   }
   public void catCanh()
   {
	   System.out.println("Bay");
   }
   public void haCanh()
   {
	   System.out.println("Ha Canh");
   }
   public double layVanToc()
   {
	   return 600 ;
   }
   
}
