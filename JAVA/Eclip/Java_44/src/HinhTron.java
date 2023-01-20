
public class HinhTron extends Hinh  {
    private int r ;
    public HinhTron (ToaDo toaDo , int r)
    {
    	super (toaDo) ;
    	this.r = r ;
    }
    // get and set 
    public int getR()
    {
    	return this.r ;
    }
    public void setR(int r)
    {
    	this.r = r ;
    }
    public double tinhDienTich()
    {
    	return this.r * this.r * Math.PI ;
    }
}
