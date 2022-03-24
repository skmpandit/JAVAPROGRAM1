import java.util.Scanner;
public class Mult_of_natural_no 
{
	public static void main(String[] args)
	{
		int i,m=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			m=m*i;
		}
		System.out.print("The number multiplecation = "+m);
	}
}
