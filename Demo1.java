
public class Demo1 
{
	int id;
	String name;
	Demo1(int i,String n)
	{
		id=i; 
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		Demo1 d=new Demo1(111,"Sonu");
		d.display();
	}
}
