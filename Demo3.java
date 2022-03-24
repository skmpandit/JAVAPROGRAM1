
 public class Demo3 
{
	int id;
	String name;
	Demo3(int i,String n)
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
		Demo3 d=new Demo3(111,"Sonu");
		d.display();
	}
}
