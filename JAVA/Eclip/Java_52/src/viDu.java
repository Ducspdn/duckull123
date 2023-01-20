
public class viDu {
   public static void main(String[] args) {
	// hàm concat : tác dụng để nối chuỗi 
	   // cách 1 :
		String s1 = "Hello";
		String s2 = "Duc";
		String s3 = s1+s2 ;
		System.out.println("s3="+s3);
		// c2 dùng hàm đã có sẵn
		String s4 = s1.concat(s3);
		System.out.println("s4 = "+s4);
	//  replaceAll : hàm thay thế chuỗi con trong một chuỗi lớn
		String sv1 = "Hello Duc Dep Trai";
		String sv2 = sv1.replaceAll("Hello", "Hi");
		System.out.println(s4.replaceAll("Hello", sv2));
		System.out.println(sv2); // Hello => Hi ;
		
	//   Hàm toUpperCase : dùng để chuyển chuỗi thường thành chuỗi in hoa
		String hvt = "tran vu huynh duc";
		System.out.println(hvt.toUpperCase()); // => TRẦN VŨ HUỲNH ĐỨC
	//  hàm toLowerCase() : dùng để chuyển chuỗi hoa thành chuỗi thường 
		String hvt1 = "TRẦN VŨ HUỲNH ĐỨC";
		System.out.println(hvt1.toLowerCase()); //=> trần vũ huỳnh đức
		
	// hàm : trim() dùng để xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
		String s9 = "     hello       duc          ";
		System.out.println(s9.trim()); // =>   hello       duc
		
	// toCharArray() : biến chuỗi thành 1 mảng các kí tự 
		
		
	// hàm subString() : dùng để cắt chuỗi con 
		String s11 = "Helllo các bạn nhé ";
		String s111 = s11.substring(1); // vị trí pos 
		System.out.println(s111); // => elllo......
	// chỉ số
		String s112 = s11.substring(1,4); // 1 - > 3 : ell
		System.out.println(s112);
}
	
}
