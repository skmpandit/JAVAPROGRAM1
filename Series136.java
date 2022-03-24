import java.util.Scanner;
public class Series136 
{
	public static void main(String[] args)
	{
		int k=1,w=2,i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<=n;i++)
		{
			System.out.print(k+",");
			k=k+w;
			w=w+1;
		}
	}
}