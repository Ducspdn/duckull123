package viDu_57;

import java.util.Arrays;

public class viDu {
   public static void main(String[] args) {
	String sc  = "Xin Chao Cac Ban,Toi La Duc Dep Trai";
	String sc1 [] = sc.split(" ");
	System.out.println(Arrays.toString(sc1));
	String sc2 [] = sc.split("\\.|\\,");
	System.out.println(Arrays.toString(sc2));
	String s3 = "Nguyen Van A";
	String[] d= s3.split(" ");
	System.out.println(Arrays.toString(d));
	System.out.println("Tên: "+d[d.length-1]);
	System.out.println(sc2);
}
}
