
public class HinhChuNhat extends Hinh {
	private int chieuDai ;
	private int chieuRong ;
	public HinhChuNhat(ToaDo toaDo , int chieuDai , int chieuRong)
	{
		// bien
		super(toaDo);
		this.chieuDai = chieuDai ;
		this.chieuRong = chieuRong ;
	}
	// get and set 
	public int getChieuDai()
	{
		return this.chieuDai ;
	}
	public void setChieuDai(int chieuDai)
	{
		this.chieuDai = chieuDai ;
	}
	public int getchieuRong()
	{
		return this.chieuRong ;
	}
	public void setChieuRong(int chieuRong)
	{
		this.chieuRong = chieuRong ;
	}
	
	

	@Override
	public double tinhDienTich() {
		return this.chieuDai * this.chieuRong ;
	}

}
