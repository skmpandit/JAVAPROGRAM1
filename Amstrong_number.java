import java.util.Scanner;
public class Amstrong_number 
{
	public static void main(String[] args)
	{
		int x,s=0,r,n;
		Scanner sc=new Scanner(System.in);
		System.out.print( "Enter the number: ");
		n=sc.nextInt();
		sc.close();
		x=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s+=r*r*r;
		}
		if(s==x)
		{
			System.out.println("Its amstrong number");
		}
		else
		{
			System.out.println("Its not amstrong number");
		}
	}
}
