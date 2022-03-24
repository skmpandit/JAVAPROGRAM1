import java.util.Scanner;
public class Series01124 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=1,d,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term:");
		n=sc.nextInt();
		sc.close();
		System.out.print(a+","+b+","+c+",");
		for(int i=4;i<=n;i++)
		{
			d=a+b+c;
			System.out.print(d+",");
			a=b;
			b=c;
			c=d;
		}
	}
}
