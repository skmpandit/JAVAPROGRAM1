import java.util.Scanner;
public class Center_digit 
{
	public static void main(String[] args)
	{
		int c,n,w;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the five digit number:");
		n=sc.nextInt();
		sc.close();
		if(n>9999&&n<=99999)
		{
			w=n/100;
			c=w%10;
			System.out.print("Its five digit number and center digit number is "+c);
		}
		else
		{
			System.out.print("Its not five digit number");
		}
	}
}
