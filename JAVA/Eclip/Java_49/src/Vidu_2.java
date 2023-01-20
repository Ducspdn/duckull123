import java.util.Scanner;

public class Vidu_2 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			String s = null ;
			// rong
			System.out.println("Nhập vào chuỗi: ");
			s = sc.nextLine();
			// nhap tu ban phim
			System.out.println("-----------------");
			
			// Hàm length() => lấy độ dài chuỗi
			System.out.println(s.length());
			int doDai = s.length();
			for(int i = 0;i<doDai;i++)
			{
			//	System.out.println("Vi tri "+i+"la "+s.charAt(2));
				System.out.println("Vi tri "+"la "+s.charAt(i));
			}
			// Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
			
			
			// Vị trí bắt đầu , Vị Trí Kết thúc -1 , mảng dữ liệu , vị trí bắt đầu lưu trong mảng .
			char [] arrchar = new char[100];
			// cap phat bo nho 
			s.getChars(2, 5, arrchar, 0);
			for(int i = 0;i<arrchar.length ;i++)
			{
				
				System.out.println("gia tri cua mang tai " +i+" la "+arrchar[i]);
				
			}
			// getbytes : tra ve gia tri so trong bang ma ascii khi lam viec chuoi
			byte[] bytechar = s.getBytes();
			for (byte c : bytechar) {
				System.out.println(c);
			}
			
			
	}
	
}

