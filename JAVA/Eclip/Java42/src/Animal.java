// lop cha 
//overrding : duoc goi la (ghi de phuong thuc) trong truong hop lop con ket thua lop cha va ta
//muon dinh nghia lai mot phuong thuc da co mat o lop cha 
//quy tac : lop con va lop cha co moi quan he ke thua 
//phuong thuc trong lop con phai co ten giong voi lop cha 
//phuong thuc trong lop con phai co tham so giong lop cha 

public class Animal {
  protected String name ;
  public Animal(String name)
  {
	  this.name = name ;
  }
  // get va set 
  public String getName()
  {
	  return this.name ;
  }
  public void setName(String name)
  {
	  this.name = name ;
  }
  public void eat()
  {
	  System.out.println("Toi dang an .....");
  }
  public void makeSound()
  {
	  System.out.println("..............");
  }
  public void sleep() 
  {
	  System.out.println("zzzzzzzzzzzzz");
  }
}
