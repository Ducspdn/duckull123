
public class Test {
	public static void main(String[] args) {
	    MyDate mp = new MyDate(15, 2, 2021);
	    MyDate mp1 = new MyDate(14, 3, 2019);
	    MyDate mp2 = new MyDate(14, 3, 2019);
	    // System.out.println(mp);
	    // chay ra doan ma cua doi tuong mp
	    //  System.out.println(mp);
	    // vi da khai bao toString
	    System.out.println(mp2.toString());
	    // khong the su dung toan tu == de so sanh 2 doi tuong trong java 
	    // toan tu ==  chi su dung cho cac kieu du lieu nguyen thuy , kieu du lieu con so
	    int a =7;
	    int b =5;
	    if(a==b)
	    {
	    	System.out.println("a==b");
	    }
	    else
	    {
	    	System.out.println("a!=b");
	    }
	    // khi so sanh 2 doi tuong trong class khong the dung toan tu ==
	    // == chi su dung de so sanh 2 so , va cac kieu du lieu nguyen thuy
	  //  if(mp1==mp2)
	  //  {
	  //  	System.out.println("mp1==mp2");
	  //  }
	 //   else
	 //   {
	 //   	System.out.println("mp1!=mp2");
	//    }
	    System.out.println("hashcode mp "+mp.hashCode());
	    System.out.println("hashcode mp1 "+mp1.hashCode());
	    System.out.println("hashcode mp2 "+mp2.hashCode());
	    // tra ve gia tri tuong uong dai dien cho doi tuong
}
}
