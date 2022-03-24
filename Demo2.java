
public class Demo2
{
	int id;
	String name;
	Demo2(int id,String name)
	{
		this.id=id; 
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		Demo2 d=new Demo2(111,"Sonu");
		d.display();
	}
}
