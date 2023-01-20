
public abstract class PhuongTienDiChuyen 
{
   protected String loaiPhuongTien  ;
   protected HangSanXuat hangSanXuat ;
   public PhuongTienDiChuyen (String loaiPhuongTien , HangSanXuat hangSanXuat)
   {
	   this.loaiPhuongTien = loaiPhuongTien ;
	   this.hangSanXuat = hangSanXuat ;
   }
   public String getloaiPhuongTien()
   {
	   return this.loaiPhuongTien ;
   }
   public void setloaiPhuongTien (String LoaiPhuongTien)
   {
	   this.loaiPhuongTien = loaiPhuongTien ;
   }
  
   public String layTenHangSanXuat1()
   {
	   return this.hangSanXuat.getHangSanXuat();
   }
   public void batDau()
   {
	   System.out.println("Gogo");
   }
   public void tangToc()
   {
	   System.out.println("Tang Toc");
   }
   public void dungLai()
   {
	   System.out.println("Dung Lai");
   }
   public abstract double layVanToc();
}


