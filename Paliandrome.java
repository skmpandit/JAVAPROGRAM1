import java.util.Scanner;
public class Paliandrome 
{
	public static void main(String[] args)
	{
		int n,s=0,x,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=sc.nextInt();
		sc.close();
		x=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(s==x)
		{
			System.out.print("Its palinadrome number");
		}
		else
		{
			System.out.print("Its not paliandrome number");
		}
	}
}
