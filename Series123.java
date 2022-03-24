import java.util.Scanner;
public class Series123 
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<n+1;i++)
		{
			System.out.print(i+",");
		}
	}
}
