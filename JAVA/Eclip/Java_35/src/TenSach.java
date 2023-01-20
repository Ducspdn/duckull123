
public class TenSach {
    private String tenSach ;
    private double giaBan ;
    private int namXuatBan ;
    private TacGia tacGia ;
    // constructer
    public TenSach( String tenSach , double giaBan , int namXuatBan , TacGia tacGia)
    {
    	this.tenSach = tenSach ;
    	this.giaBan = giaBan ;
    	this.namXuatBan = namXuatBan ;
    	this.tacGia = tacGia ;
    }
    // viet phuong thuc get va set 
    public String gettenSach()
    {
    	return this.tenSach ;
    }
    public void settenSach(String tenSach)
    {
    	this.tenSach =tenSach ;
    }
    public double getgiaBan()
    {
    	return this.giaBan ;
    }
    public void setgiaBan(double giaBan)
    {
    	this.giaBan = giaBan ;
    }
    public int getnamXuatBan()
    {
    	return this.namXuatBan ;
    }
    public void setnamXuatBan(int namXuatBan)
    {
    	this.namXuatBan = namXuatBan ;
    }
    public TacGia gettacGia()
    {
    	return this.tacGia ;
    }
    public void tacGia (TacGia tacGia)
    {
    	this.tacGia = tacGia ;
    }
    public void inTenSach()
    {
    	System.out.println(this.tenSach);
    }
    public boolean kiemTraCungNamXuatBan(TenSach sachKhac)
    {
    	return this.namXuatBan == sachKhac.namXuatBan ;
    }
    public double giaSauKhiGiam(double x)
    {
    	return this.giaBan *((1-x)/100 );
    }
    
    
}
