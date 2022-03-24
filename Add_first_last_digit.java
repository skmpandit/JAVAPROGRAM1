import java.util.Scanner;
public class Add_first_last_digit 
{
	public static void main(String[] args)
	{
		int l,f,n,s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the four digit number:");
		n=sc.nextInt();
		sc.close();
		if(n>999&&n<=9999)
		{
			l=n%10;
			f=n/1000;
			s=f+l;
			System.out.print("First and last digit summition is "+s);
			System.out.print("Its four digit number");
		}
		else
		{
			System.out.print("Its not four digit number");
		}
	}
}
