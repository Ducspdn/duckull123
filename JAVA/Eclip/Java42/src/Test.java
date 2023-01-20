
public class Test {
  public static void main(String[] args) {
	
	  Dog dog1 = new Dog();
	  dog1.eat();
	  dog1.makeSound();
	  dog1.sleep(); 
	  System.out.println("-------");
	  // truyen vao constructer khong co tham so
	  Cat cat1 = new Cat() ;
	  // k overrding 
	  cat1.eat(); 
	  cat1.makeSound();
	  System.out.println("--------");
	  Bird bird1 = new Bird();
	  bird1.eat(); 
	  bird1.makeSound();
	  System.out.println(bird1.getName());
	  bird1.setName("Bird VgM");
	  System.out.println(bird1.getName());
	
  }
}
