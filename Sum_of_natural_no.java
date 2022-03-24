import java.util.Scanner;
public class Sum_of_natural_no 
{
	public static void main(String[] args)
	{
		int n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.print("The sum = "+s);
	}
}