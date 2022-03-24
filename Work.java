//final class don't inherit and over write
class poly
{
	void demo()
	{
		System.out.println("Hello java");
	}
}
public class Work extends poly
{
	 void demo()
	{
		System.out.println("Hello c");
	}
	public static void main(String[] args)
	{
		Work w=new Work();
		w.demo();
	}
}
