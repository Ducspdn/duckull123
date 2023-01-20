
public class Animals {
    protected String name ;
    // constructer 
    public Animals (String name)
    {
    	this.name = name ;
    }
    // get  and set 
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
    	System.out.println("Im am eating");
    }
}
