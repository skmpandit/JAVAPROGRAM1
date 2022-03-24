package switchstatement;

public class Test3 
{
	public static void main(String[] args)
	{
		int day=3;
		String dayname;
		String daytype;
		switch(day)
		{
		case 1:
			dayname="Monday";
			break;
		case 2:
			dayname="Tuesday";
			break;
		case 3:
			dayname="Wednesday";
			break;
		case 4:
			dayname="Thursday";
			break;
		case 5:
			dayname="Friday";
			break;
		case 6:
			dayname="Saturday";
			break;
		case 7:
			dayname="Sunday";
			break;
		default:
			dayname="Invalide inpute please enter 1 to 7 number";
		}
		switch(day)
		{
		case 1:
		case 2:
		case 3:
			daytype="Weekday";
			break;
		case 4:
			daytype="Weekend";
		default:
			daytype="Invalide daytype";
		}
		System.out.println(dayname+" is a "+ daytype);
	}
}
