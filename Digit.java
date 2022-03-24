import java.util.Scanner;
public class Digit 
{
	public static void main(String[] args)
	{
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		sc.close();
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.print("Number of digit : "+c);
	}
}
