import java.util.Scanner;
public class Series2 
{
	public static void main(String[] agrs)
	{
		int i,j,s=0,n,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+s;
			for(j=1;j<=i;j++)
			{
				s=s+j;
			}
		}
		System.out.println(sum);
	}
}
