import java.util.Scanner;
public class Divisible_by_3and5 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		sc.close();
		if(n%3==0&&n%5==0)
		{
			System.out.println("Your given number is divided by 3 and 5");
		}
		else
		{
			System.out.println("Your given number is not divided by 3 and 5");
		}
	}
}
