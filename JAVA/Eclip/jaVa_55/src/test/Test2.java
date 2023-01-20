package test;
import java.util.Arrays;

import test.sinhVien; 
public class Test2 {
     public static void main(String[] args) {
    	 sinhVien sv1 = new sinhVien(150, "Nguyen Thanh Binh", "lop 150", 9.2);
         sinhVien sv2 = new sinhVien(130, "Tran Vu Huynh Duc", "lop 200", 9.8);
         sinhVien sv3 = new sinhVien(140, "Huyh An", "lop 111", 7.1);
         sinhVien [] a_sv = new sinhVien[] {sv1 , sv2 , sv3};
         System.out.println(" Ban Dau "+Arrays.toString(a_sv));
         // ham sap xep 1 doi tuong can biet xay dung compareTo
         Arrays.sort(a_sv);
         System.out.println("sau sap xep"+Arrays.toString(a_sv));
         // tim kiem 
         System.out.println("tim kiem "+Arrays.binarySearch(a_sv, sv3));
	}
}
