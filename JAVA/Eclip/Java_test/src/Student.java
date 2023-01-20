
import java.util.Scanner ;
	class Student1{
	    private String Name ;
	    private int age ;
	    private String gender ;
	    private double gpa ;
	    public Student1(String Name , int age , String gender , double gpa)
	    {
	        this.Name = Name ;
	        this.age = age ;
	        this.gender = gender ;
	        this.gpa = gpa ;
	    }
	    public void display()
	    {
	        System.out.println("Name : "+Name) ;
	        System.out.println("Age : "+age);
	        System.out.println("Gender : "+gender) ;
	        System.out.println("Gpa : " + gpa) ;
	    }
	}
	public class Student {
	    public static void main (String[] args)
	    {
	         Student1 sc = new Student1("Duc",19,"Nam",5.6);
	         sc.display();
	    }
	}


