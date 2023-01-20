
public class SetGet {
// hieu ro phuong thuc set va get trong java 
	// giup chung ta lay du lieu ra va thay doi khi khai bao thuoc tinh private 
	private int day ;
	private int month ;
	private int year ;
	public SetGet(int day , int month , int year)
	{
		
		// ham constructer 
		// kiem tra dung sai
		if(day>=1 && day <=31)
		{
			this.day = day ;
		}
		else
		{
			this.day = 1 ;
		}
		if(month >= 1 && month <=12)
		{
			this.month = month ;
		}
		else
		{
			this.month = 1 ;
		}
		if(year > 0)
		{
			this.year = year ;
		}
		else
		{
			year = 1 ;
		}
	}
	// muon lay ra gia tri thuoc tinh trong class dung get 
	public int getDay()
	{
		return this.day ;
	}
	// ham set dung de thay doi gia tri cua thuoc tinh trong class
	public void setDay1(int d)
	{
		if(d>=1&&d<=31)
		{
			this.day = d ;
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) 
	{
		if(month >= 1 && month <=12)
		{
			this.month = month;
		}
		// this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) 
	{
		if(year>0)
		{
			this.year = year;
		}
		// this.year = year;
	}
	// de viet nhanh get va set ta su dung Source -> Generate setter and getter
	
	
}
