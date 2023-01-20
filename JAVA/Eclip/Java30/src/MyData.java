
public class MyData {
	// cac thuo tinh
     private int Day ;
     private int month ;
     private int year ;
     public MyData(int d , int m , int y)
     {
    	 this.Day = d ;
    	 this.month = m ;
    	 this.year = y ;
     }
     public void printDay()
     {
    	 System.out.println("Day:"+this.Day);
     }
     public void printMonth()
     {
    	 System.out.println("Month : "+this.month);
     }
     public void printyear()
     {
    	 System.out.println("Year : "+this.year) ;
     }
     public void printDate()
     {
    	 System.out.println(" Date : "+this.Day+"-"+this.month+"-"+this.year);
     }
}
