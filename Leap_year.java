import java.util.Scanner;
public class Leap_year 
{
	public static void main(String[] args)
	{
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		y=sc.nextInt();
		sc.close();
		if(y%4==0)
		{
			System.out.println("The year is leap year");
		}
		else
		{
			System.out.println("Its not leap year");
		}
	}
}
