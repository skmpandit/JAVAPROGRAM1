import java.util.Scanner;
public class Series1010 
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the last term: ");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<n;i++)
		{
			System.out.print(i%2+",");
		}
	}
}
