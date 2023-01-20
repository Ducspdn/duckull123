
public class ViDu {
 // so sánh chuỗi trong java
	public static void main(String[] args) {
		// hàm equals : dùng để so sánh 2 chuỗi có giống nhau hay không , và có phân biệt chữ thường
		String s1 = "tivi";
		String s2 = "tivI";
		String s3 = "tivi";
		System.out.println("s1 equals s2 "+ s1.equals(s2));
		System.out.println("s1 equals s3 "+s1.equals(s3));
		// ham equalsIgnoreCase : so sánh 2 chuỗi có giống nhau hay không không phân biệt chữ thường và chữ hoa
	     String sv1 = "newDuc";
	     String sv2 = "newDuC";
	    System.out.println(sv1.equalsIgnoreCase(sv2));
	    
	    // trả về giá trị lớn hơn hoặc bằng hoặc hơn : > = < 
	    // compareTo() : dùng để so sánh 2 chuỗi có giống nhau hay không , và có phân biệt chữ thường
	    String sv3 = " Nguyen Van A ";
	    String sv4 =  " Nguyen Van A ";
	    String sv6 = " Tran Vu huynh Duc ";
	    String sv7 = " tran vu huynh duc ";
	    String Sv8 = "   tran vu huynh duc ";
	    System.out.println(sv3.compareTo(sv4));
	    // compareToIgNoreCase() : so sánh 2 chuỗi , và không phân biệt chữ hoa và chữ thường 
	    System.out.println(sv6.compareToIgnoreCase(sv7));
	    System.out.println(sv7.compareToIgnoreCase(Sv8));
	    //  Hàm regionMatches => so sánh một đoạn (vi tri bat dau chuoi 1, chuoi 2, vi tri dau chuoi 2 , vi tri ket thuc chuoi 2 -1)
	    // có phân biệt chữ hoa và chữ thường
	    
	    String r1 = "TITV.vnn";
		String r2 = "TV.v11";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		// // Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ...
		// 0702525937 
		String sdt = "0702525937";
		if(sdt.startsWith("070"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		String sdt2 = "111111111";
		if(sdt2.startsWith("2"))
		{
			System.out.println("No");
		}
		System.out.println("yes");
		// hàm endWith : kiểm tra chuỗi cuối cùng bằng
		String s1n = "I love you";
		if(s1n.endsWith("you"))
        {
	      System.out.println("Yes");
        }
       else
       {
	      System.out.println("no");
       }
	
}
}
