
public class Demo4 
{
	void show()
	{
		System.out.println("Hello");
	}
	void display()
	{
		this.show();
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		Demo4 d=new Demo4();
		d.display();
	}
	
}
