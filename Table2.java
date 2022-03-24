import java.util.Scanner;
public class Table2 
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Who many table you want:");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.print(i+"x"+j+"="+i*j+"\n");
			}
			System.out.println();
		}
	}
}
