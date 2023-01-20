
public class Test {
 public static void main(String[] args) {
	MyMath mm = new MyMath();
	System.out.println("So Sanh a va b : min "+mm.timMin(3, 4));
	System.out.println("so sanh a va b : double "+mm.timMin(3.4, 4.5));
	double arr[] = new double[] {1, 2, 3, 4};
	System.out.println(mm.tinhTong(arr));
	
}
}
