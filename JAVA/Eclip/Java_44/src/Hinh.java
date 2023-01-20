
public abstract class Hinh {
	private  ToaDo toaDo;
	// no abstract trong thuoc tinh
	// co the su dug protected , public , parivate

	public Hinh(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
//	Phương thức abstract của abstract class không được phép khai báo nội dung phương thức. Nó chỉ có thể định nghĩa tên cũng như các tham số đầu vào.
	public abstract double tinhDienTich();
	// Nó chỉ có thể định nghĩa tên cũng như các tham số đầu vào.
//	Mức truy cập các hàm của abstract phải ở public hoặc protected để lớp kế thừa có thể định nghĩa lại và các thuộc tính của lớp abstract không được khai báo abstract. Ví dụ : khai báo 1 abstract class
}
