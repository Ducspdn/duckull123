package test;

import java.util.Arrays;

public class viDu {
	// viet ham dao nguoc mang
	public static int[] reverse (int []x)
	{
		int rs [] = new int [x.length];
		int index = 0 ;
		for(int i = x.length - 1 ;i>= 0 ;i--)
		{
			rs [index] = x[i];
			index++; 
		}
		return rs ;
		
		
	}
 public static void main(String[] args) {
	int [] a = new int [] {1,5,7,3,9,6};
	int [] b = new int [15];
	// mang ban dau
	System.out.println("mang ban dau a"+Arrays.toString(a));
	
	// ham sort : sap xep mang tang dan 
	Arrays.sort(a);
	System.out.println("mang sau khi sap xep "+Arrays.toString(a));
	
	// tim kiem nhi phan binarysearch()
	System.out.println("tim kiem trong mang  a = "+Arrays.binarySearch(a, 7));
	System.out.println("tim kiem trong mang a = "+Arrays.binarySearch(a, -2));
	
	
	// dien gia tri fill()
	Arrays.fill(b, 3);
	System.out.println("dien 1 gia tri"+Arrays.toString(b));
	// ham toString() :  de bieu dien duoi dang 1 chuoi 
	
	// ham reverse()
	Arrays.sort(a);
	a = viDu.reverse(a) ;
	System.out.println("mang nguoc a = "+Arrays.toString(a));
	
}
}
