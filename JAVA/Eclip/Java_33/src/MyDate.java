
public class MyDate {
	// attribute 
     private int day ;
     private int month ;
     private int year ;
     // constructer
  public MyDate (int day , int month , int year)
  {
	  if(day > 0 && day <=31)
	  {
		  this.day = day ;
	  }
	  else
	  {
		  this.day = 1 ;
	  }
	  if(month > 0 && month <=12)
	  {
		  this.month = month ;
	  }
	  else
	  {
		  this.month = 1 ;
	  }
	  if(year > 0 )
	  {
		  this.year = year ;
	  }
	  
  }
  // de tao nhanh constructer trong java ta chon duoi toString
  public int getDay()
  {
	  return this.day ;
  }
  public void setDay(int day)
  {
	  if(day>0 &&day<=31)
	  {
		  this.day = day ;
	  }
  }
  public int getMonth()
  {
	  return this.month ;
  }
  public void setMonth(int month)
  {
	  if(month>0&&month<=12)
	  {
		  this.month = month ;
	  }
  }
  public int getYear()
  {
	  return this.year ;
  }
  public void setYear(int year)
  {
	  if(year > 0 )
	  {
		  this.year = year ;
	  }
  }
@Override
public String toString() 
{
	//return this.day + "/"+ this.month +"/"+this.year ;
	// tuy vao muc dich muon in ra cua so conslole
	return this.day +"" ;
	// dung de hien thi cac private can xuat hien tren console
}
 
}
















