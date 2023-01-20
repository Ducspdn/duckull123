
public class Test {
   public static void main(String[] args) {
	baByDog bbd = new baByDog() ;
	bbd.eat(); 
	bbd.bark(); 
	bbd.weep();
	System.out.println(bbd.name);
	bbd.name = "Dog111";
	// System.out.println(bbd.name);
	// ke thua muiltilevel 
}
}
