
public class Test {
   public static void main(String[] args) {
	Dog d = new Dog();
	
	d.eat();
	d.bark();
	
	
	Cat c = new Cat() ;
	c.eat(); 
	c.meow(); 
	
	
	Bird e = new Bird("fllllly") ;
	// truyen tham so kieu String 
	e.eat();
	e.fly1();
	System.out.println(e.getName());
	// fllly
	System.out.println(e.getClass());
	// tra ve lop ta ra bird
	e.setName("bay bay");
	// thay doi gia tri
	System.out.println(e.getName());
	// bay bay 
}
}
