
public class HoaDonCafe {
    private  String tenLoaiCafe ;
    private  double giaTien1Kg ;
    private  double soLuong ;
   
   public HoaDonCafe (String ten , double gia , double soluong)
   {
	   this.tenLoaiCafe = ten ;
	   this.giaTien1Kg = gia ;
	   this.soLuong = soluong ;
	   
   }
   // viet phuong thuc tinh tong tien
   public double tinhTongtien()
   {
	   return giaTien1Kg * soLuong ;
   }
   // viet phuong thuc kiem tra
   public boolean kiemTraKhoiLuongLonHon(double kl)
   {
	   if(this.soLuong > kl)
	   {
		   return true ;
	   }
	   else 
	   {
		   return false ;
	   }
	   
	   // c2 return this.soLuong > kl ; 
   }
   // kiem tra gia tien co lon hon 500000 hay khong ?
    public boolean kiemTra()
    {
    	return this.giaTien1Kg * this.soLuong > 500000 ;
    	// no se tra ve true neu dung else tra false 
    	// c2 return this.tinhTongtien() > 500000  
    }
    // tinh so tien giam gia, giam x % neu tong hoa don co gia tri lon hon 500000 
    public double giamGia(double x)
    {
    	if(this.tinhTongtien()>500000)
    	{
    		return (x/100)*this.tinhTongtien();
    	}
    	return 0 ;
    }
    // tinh so tien khach phai tra sau khi da giam gia 
    public double soTienTra(double x)
    {
    	if(this.tinhTongtien()>500000)
    	{
    	     return this.tinhTongtien() - this.giamGia(x);
    	}
    	else
    	{
    		return this.tinhTongtien() ;
    	}
    }
}
