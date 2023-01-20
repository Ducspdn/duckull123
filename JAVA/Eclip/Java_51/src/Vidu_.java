
public class Vidu_ {
  public static void main(String[] args) {
	String s1 = " hello cac bạn , hello , hello ";
	String s2 = "hello";
	String s3 = "cc";
	char s4 = 'c';
	// indexOf : dùng để trả về 1 số xâu này xuất hiện trong xâu khác hoặc trong kí tự
	// duyệt từ trái sang phải
	System.out.println(s1.indexOf(s2)); // 1 ; >= 0 
	System.out.println(s1.indexOf(s3)); // -1 
	// cách 2 : dùng chỉ số
	System.out.println(s1.indexOf(s2,2)); // 17
	// c3 :  tìm kiếm char
	System.out.println(s1.indexOf(s4)); // 7 
	System.out.println(s1.indexOf(s4,8)); // 9
	
	
	// lastIndex() : duyệt từ phải sang trái 
}
}
