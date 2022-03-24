abstract class A4
{
	abstract void show();
	void demo()
	{
		System.out.println("Hello");
	}
}
public class Demo41 extends A4
{
	void show()
	{
		System.out.println("Hii");
	}
	public static void main(String[] args)
	{
		Demo41 d=new Demo41();
		d.show();
		d.demo();
	}
}
