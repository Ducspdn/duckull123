
public class Test {
  public static void main(String[] args) {
	ToaDo toaDo1 = new ToaDo(5, 7);
	ToaDo toaDo2 = new ToaDo(8, 7);
	// không thể khởi tạo đối tượng của abstract class
	// Hinh hinh1 = new Hinh() loi ben dich
	Hinh Hinh1 = new Diem(toaDo1);
	Hinh Hinh2 = new HinhTron(toaDo1, 5);
	System.out.println(Hinh2.tinhDienTich());
	// Các class khi kế thừa một abstract class sẽ phải định nghĩa lại các phương thức trừu tượng của abstract class
	

}
}
