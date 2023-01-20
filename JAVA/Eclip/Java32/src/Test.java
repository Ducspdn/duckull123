
public class Test 
{
 public static void main(String[] args)
 {
	SetGet mp = new SetGet(2,3,2021);
	System.out.println(mp.getDay());
	mp.setDay1(35);
	System.out.println(mp.getDay());
	mp.setDay1(12);
	System.out.println(mp.getDay());
}
}
