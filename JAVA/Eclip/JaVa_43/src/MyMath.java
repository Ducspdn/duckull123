// Nạp chồng phương thức - Overloading trong Java 
//Overloading la viec tao ra nhieu phuong thuc ben trong 1 lop co chung ten 
//nhung khac tham so truyen vao (kieu du lieu )

//ly do : tang tinh su dung cho cac phuong thuc ben trong mot lop 
public class MyMath {
	// khong khai bao constructer hieu ngam dinh la rong 
    public int timMin(int a, int b)
    {
    	if(a<b)
    	{
    		return a ;
    	}
    	return b ;
    }
    public double timMin(double a, double b)
    {
    	if(a<b)
    	{
    		return a ;
    	}
    	return b ;
    }
    public double tinhTong(int a, int b)
    {
    	return a+b ;
    }
    public double  tinhTong ( double []arr)
    {
    	double tong = 0 ;
    	for(int i = 0;i<arr.length;i++)
    	{
    		tong+=arr[i];
    	}
    	return tong ;
    }
    
}
