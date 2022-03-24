
public class Demo5 
{
	Demo5()
	{
		System.out.println("Hello");
	}
	Demo5(int x)
	{
		this();
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		Demo5 d=new Demo5(10);
	}
}
