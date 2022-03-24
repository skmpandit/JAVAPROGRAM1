abstract class XX
{
	abstract void show();
}
public class Abstract1 extends XX
{
	void show()
	{
		System.out.println("Hello how are you");
	}
	public static void main(String[] args)
	{
		Abstract1 d=new Abstract1();
		d.show();
	}
}
