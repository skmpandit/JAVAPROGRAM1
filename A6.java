abstract class Style
{
	Style()
	{
		System.out.println("Constractor demo");
	}
	abstract void run();
	void demo()
	{
		System.out.println("Hello java");
	}
}
class A5 extends Style
{
	void run()
	{
		System.out.println("We are there");
	}
}
public class A6 
{
	public static void main(String[] args)
	{
		Style s=new A5();
		s.run();
		s.demo();
	}
}
