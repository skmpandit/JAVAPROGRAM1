import java.util.Scanner;
public class Table1 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number which you want table: ");
		n=sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+"x"+i+"="+n*i+"\n");
		}
	}
}
