package test;

public class sinhVien implements Comparable<sinhVien>{
    private int maSinhVien ;
    private String hoVaten ;
    private String tenLop ;
    private double diemTrungBinh ;
    // xay dung constructer 
    public sinhVien (int maSinhVien , String hoVaTen , String tenLop , Double diemTrungBinh)
    {
    	this.maSinhVien = maSinhVien ;
    	this.hoVaten = hoVaTen ;
    	this.tenLop = tenLop ;
    	this.diemTrungBinh = this.diemTrungBinh ;
    }
    // xay dung ham get and set 
    public int getmaSinhVien()
    {
    	return this.maSinhVien ;
    }
    public void setmaSinhVien(int maSinhVien)
    {
    	this.maSinhVien = maSinhVien ;
    }
    public String gethoVaTen()
    {
    	return this.hoVaten ;
    }
    public void sethoVaTen(String hoVaTen)
    {
    	this.hoVaten = hoVaTen ;
    }
    public String gettenLop()
    {
    	return this.tenLop ;
    	
    }
    public void settenLop(String tenLop)
    {
    	this.tenLop = tenLop ;
    }
    public double getdiemTrungBinh()
    {
    	return this.diemTrungBinh ;
    }
    public void setdiemTrungBinh(double diemTrungBinh)
    {
    	this.diemTrungBinh = diemTrungBinh ;
    }
    // viet phuong thuc  de cat chuoi , so sanh chu cai cuoi 
    public String getTen()
    {
    	
    	String s = this.hoVaten.trim();
    	// ham dung de cat cac khoang trang thua o 2 dau cua chuoi 
    	if(s.indexOf(" ")>=0)
    	{
    		int vt = s.lastIndexOf(" ");
    		// tra ve chi so dau cach 
    		return s.substring(vt+1);
    		// cat chuoi 
    	}
    	else
    	{
    		// truong hop chuoi khong ngat quang 
    		return s ;
    	}
    }
	@Override
	public int compareTo(sinhVien o) {
		String tenThis = this.getTen();
	String teno = o.getTen();
		return tenThis.compareTo(teno);
		// TODO Auto-generated method stub
		// xay dung diem
		//Double Diem = this.diemTrungBinh ;
		//return Diem.compareTo(o.diemTrungBinh);
		
	}
	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", hoVaten=" + hoVaten + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


