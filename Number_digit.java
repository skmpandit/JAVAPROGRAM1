import java.util.Scanner;
public class Number_digit 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		sc.close();
		if(n>9&&n<=99)
		{
			System.out.println("Its two digit number");
		}
		else if(n>99&&n<=999)
		{
			System.out.println("Its three digit number");
		}
		else if(n>999&&n<=9999)
		{
			System.out.println("Its four digit number");
		}
		else
		{
			System.out.println("Its out of range");
		}
	}
}
