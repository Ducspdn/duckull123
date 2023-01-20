package code_Learn;
import java.util.Scanner ;
class student {
	private String Name ;
	private int Age ;
	public student(String Name , int Age)
	{
		this.Name = Name ;
		this.Age = Age ;
	}
	public void display()
	{
		System.out.println("Name" + Name);
		System.out.println("Age"+Age);
	}
}
public class code_Learn1 {
    public static void main(String[] args)
    {
    	student [] sc = new student [3] ;
    	sc[0] = new student("duc :",10) ;
    	sc[1] = new student("thien :" ,1) ;
    	sc[2] = new student("da : ",4);
    	for(int i = 0 ;i<3;i++)
    	{
    		sc[i].display();
    	}
    }
}
