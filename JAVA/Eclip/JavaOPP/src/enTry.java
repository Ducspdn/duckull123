import java.util.Scanner ;
class Math{
	public static double PI = 3.14 ;
	
	public  int add(int x, int y)
	{
		return x + y ;
	}
	public  int subtract(int x , int y)
	{
		return x - y ;
	}
	public  int min(int x , int y)
	{
		if(x<y)
		{
			return x ;
		}
		return y ;
		
	}
	public  int max(int x , int y)
	{
		if(x>y)
		{
			return x ;
		}
		return y ;
	}
}
class Amduong{
	public static void amduong (int a)
	{
		if(a>0)
		{
		   System.out.print("Duong");
		}
		else
		{
			System.out.println("Am");
		}
	}
}
public class enTry {
	  public static int max1(int a, int b)
	  {
		  if(a>b)
		  {
			  return a ;
		  }
		  else
		  {
			  return b ;
		  }
	  }
      public static void main(String[] args)
      {
    	  //System.out.println(Math.max(5, 7));
    	  // Amduong.amduong(8);
    	  System.out.println(max1(2,3));
      }
}
