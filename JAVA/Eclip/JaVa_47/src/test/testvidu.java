package test;
import code_a.vidu;
import code_b.vidu1;
import test.test_a1.vidu2 ;
public class testvidu {
     public static void main(String[] args) {
		vidu vd = new vidu(4, 5);
		System.out.println(vd.getClass());
		System.out.println(vd.getA());
		vidu1 vd1 = new vidu1(5, 6);
	//	code_b.vidu vd1 = new code_b.vidu(5, 6);
		System.out.println(vd1.getA());
		System.out.println(vd1.getClass());
		vidu2 vd2 = new vidu2(10, 4);
		System.out.println(vd2.getB());
	}   
}
// hiểu rõ về gói _ Package trong lập trình Java 
// các class có thể giống tên nhau trong trường hợp ở 2 package khác nhau
// nếu trong trường hợp import vào 1 packege nếu 2 class trùng tên thì lỗi chương trình
// đặt tên : chữ thường , packege có thể lồng package
// tác dụng : là để chia nhỏ chương trình lớn thành nhiều phần dễ code và phát triển
// để dùng được class trong package thì cần dùng từ khóa import
// trong package có thể chứa package con 
// import trong Java là từ khóa sử dụng để nạp các Package chứa class cần dùng vào một chương trình Java.
