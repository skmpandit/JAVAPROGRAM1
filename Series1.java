import java.util.Scanner;
public class Series1 
{
	public static void main(String[] args)
	{
		int n,i;
		float s=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			s=s+1/i;
		}
		System.out.println("The summition is "+s);
	}
}
