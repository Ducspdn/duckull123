
public class TacGia {
    private String tenTacGia ;
    private Ngay ngaySinh ;
    // constructer 
    public TacGia( String tenTacGia , Ngay ngaySing)
    {
    	this.tenTacGia = tenTacGia ;
    	this.ngaySinh = ngaySinh ;
    	
    }
    // get va set 
    public String gettenTacGia()
    {
    	return this.tenTacGia ;
    }
    public void  setTacGia(String tenTacGia) {
		
		this.tenTacGia = tenTacGia;
	}
    public Ngay getngaySinh()
    {
    	return this.ngaySinh ;
    }
    public void setngaySinh( Ngay ngaySinh)
    {
    	this.ngaySinh = ngaySinh ;
    }
	
	
}
