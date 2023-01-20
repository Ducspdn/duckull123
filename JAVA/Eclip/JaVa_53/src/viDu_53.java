import java.util.Arrays;

public class viDu_53 {
   public static void main(String[] args) {
	
	  // kiểu dữ liệu nguyên thủy 
	  int mang[]= {1,2,3,4};
	  // vì kiểu dữ liệu bị thay đổi nên cả 2 mảng đều giống nhau
	  // coppy mảng c1 :
	  int mang2[] = mang ;
	  mang2[0] = 100 ;
	  System.out.println("Mang : "+Arrays.toString(mang));
	  // hàm dùng để in all giá trị của mảng thay vì duyệt qua for 
	  System.out.println("Mang2 : "+Arrays.toString(mang2));
	  
	  
	  // coppy mảng c2 : -dùng hàm clone() : khi thay đổi mảng mới thì mảng cũ mặc định sẽ giữ nguyên không bị hay đổi
	  
	  int mang1_b[] = mang.clone();
	  mang1_b[0] = 20 ;
	  System.out.println(Arrays.toString(mang1_b)); // 20 , 2,3,4
	  System.out.println(Arrays.toString(mang));  // 100 , 2 , 3 , 4
	  
	  
	  // coppy mảng c3 :  dùng hàm System.arraycoppy ()
	  int []mang1_c = new int[mang.length];
	  System.arraycopy(mang, 0,mang1_c , 0, mang.length);
	  
	  mang1_c[0]=50;
	  System.out.println(Arrays.toString(mang1_c)); // in tất cả giá trị của mảng
	  
}
}
