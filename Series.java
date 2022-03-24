import java.util.Scanner;
public class Series 
{
	public static void main(String[] args)
	{
		int n,s=0,k=1,w=2;
		Scanner sc=new Scanner(System.in);
		System.out.print( "Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			s=s+k;
			k=k+w;
			w=w+1;
		}
		System.out.print(s);
	}
}
