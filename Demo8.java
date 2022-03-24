interface E2
{
	void demo();
	void show();
}
public class Demo8 implements E2
{
	public void demo()
	{
		System.out.println("Hello java");
	}
	public void show()
	{
		System.out.println("Hello c");
	}
	public static void main(String[] args)
	{
		Demo8 obj=new Demo8();
		obj.demo();
		obj.show();
	}
}
