import java.util.Objects;

// hieu ro phong thuc equals && hashcode 
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >= 1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} 
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		}
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
		// tra ve cac chuoi , duoc cau thanh tu cac thuoc tinh cua cac lop 
		//
	}
	// Object la lop dai dien cho tat ca cac doi tuong tro java 

	@Override
	// hashcode : tra ve gia tri dai dien cho doi tuong nao do trong class
	
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	// ham == phuong thuc
	public boolean equals(Object obj) {
		if (this == obj)
			// md1.equals(md1) 
			// doi tuong truyen vao equals == doi tuong dang dung return true 
			return true;
		if (obj == null)
			// doi tuong truyen vao == rong 
			// khong the lay doi tuong ss vs doi tuong rong 
			return false;
		if (this.getClass() != obj.getClass())
			// tra ve 2 lop neu  lop khac nhau thi return false 
			return false;
		MyDate other = (MyDate) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}
	// hashcode : tra ve gia tri dai dien cho doi tuong nao do trong class
	
     
}
