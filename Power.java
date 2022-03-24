import java.util.Scanner;
public class Power 
{
	public static void main(String[] args)
	{
		int n,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		sc.close();
		if(n>9&&n<=99)
		{
			x=n*n;
			System.out.println("Its two digit number and power is "+x);
		}
		else if(n>99&&n<=999)
		{
			x=n*n;
			System.out.println("Its three digit number and power is "+x);
		}
		else if(n>999&&n<=9999)
		{
			x=n*n;
			System.out.println("Its four digit number and power is "+x);
		}
		else 
		{
			System.out.println("Its out of range");
		}
	}
}
