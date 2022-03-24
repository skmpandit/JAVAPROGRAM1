package switchstatement;

public class Test1 
{
	public static void main(String[] args)
	{
		int day=5;
		String daystring;
		switch(day)
		{
		case 1:
			daystring="Monday";
			break;
		case 2:
			daystring="Tuesday";
			break;
		case 3:
			daystring="Wednesday";
			break;
		case 4:
			daystring="Thurday";
			break;
		case 5:
			daystring="Friday";
			break;
		case 6:
			daystring="Saturday";
			break;
		case 7:
			daystring="Sunday";
		default:
			daystring="Invalid day";
		}
		System.out.println(daystring);
	}
}
