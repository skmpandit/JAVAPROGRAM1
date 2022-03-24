
public class TryCatch {
	public static void main(String[] args)
	{
		try
		{
			int a=100/10;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("We are in catch block");
		}
	}
}
