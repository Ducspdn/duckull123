
public class Test {
public static void main(String[] args) {
	MayTinhCasioFX500 mt = new MayTinhCasioFX500();
	System.out.println("cộng "+mt.cong(5, 3));
	System.out.println("tru "+mt.tru(5, 4));
	MayTinhVinaCal500 mt1 = new MayTinhVinaCal500();
	System.out.println("tru"+mt1.chia(6, 3));
	System.out.println("test cau b");

	double[] arr = new double[] {5,1,3,4,5,8,0};
	double[] arr2 = new double[] {6,2,7,9,2,4,5};
	SapXepChen sxchen = new SapXepChen();
	SapXepChon sxchon = new SapXepChon();
	
	sxchen.sapXepTang(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	sxchon.sapXepGiam(arr2);
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	System.out.println("test cau c");
	PhanMenMayTinh pmmt = new PhanMenMayTinh();
	System.out.println(pmmt.chia(8, 2));
	double []arr3 = new double[] {1,3,5,2,9};
	pmmt.sapXepTang(arr3);
	for(int i = 0;i<arr3.length;i++)
	{
		System.out.println(arr3[i]+" ");
	}
	//Một interface trong java la một bản thiết kế của 1 lớp(hiểu nôm na là đa kế thừa)
	// nó chỉ có các phương thức trừu tượng và các hằng số
	// tất cả các hằng số được mặc định ở dạng public static final
	// tat ca cac phuong thuc la o dang public 
	// tuong tu nhu abstract no khong the duoc khoi tao thanh doi tuong 
	// để thu được tính trường tượng và đa kế thừa trong java
	// một lớp có thể triển khai một hoặc nhiều intrface tại một thời điểm 
	// một interface có thể kế thừa từ một interface khác , tương tự một lớp có thể kế thừa  lớp khác 
	// implements : dùng để hiện thực lại các phương thức trong interface 
	
	
		
}
}
