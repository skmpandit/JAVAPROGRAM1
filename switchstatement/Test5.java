package switchstatement;

public class Test5 
{
	public static void main(String[] args)
	{
		String str="TWO";
		switch(str)
		{
		case "ONE":
			System.out.println("This is ONE block");
			break;
		case "TWO":
			System.out.println("This is TWO block");
			break;
		default:
			System.out.println("This is default block");
		}
	}
}
