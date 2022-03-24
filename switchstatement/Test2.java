package switchstatement;
import java.util.Scanner;
public class Test2 
{
	public static void main(String[] args)
	{
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for day:");
		day=sc.nextInt();
		String dayname;
		sc.close();
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
			dayname="Invalid inpute please enter the 1 to 7 number";
		}
		System.out.println(dayname);
	}
}
