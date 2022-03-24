import java.util.Scanner;
public class Series0112 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		System.out.print(a+","+b+",");
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}
}
