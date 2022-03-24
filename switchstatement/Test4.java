package switchstatement;

public class Test4 
{
	public static void main(String[] args)
	{
		int year=2;
		String s="BCA";
		switch(year)
		{
		case 1:
			System.out.println("This is first block");
			break;
		case 2:
			switch(s)
			{
			case "MCA":
				System.out.println("This is MCA block");
				break;
			case "BCA":
				System.out.println("This is BCA block");
				break;
			case "BBA":
				System.out.println("This is BBA block");
				break;
			default:
				System.out.println("This default block");
			}
			break;
		default:
			System.out.println("This is another default block");
		}
	}
}
