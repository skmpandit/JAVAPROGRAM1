import java.util.Scanner;
public class Reverse_number 
{
	public static void main(String[] args)
	{
		int n,r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		sc.close();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		System.out.print( "Reverse number is "+s);
	}
}
