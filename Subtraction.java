import java.util.Scanner;
public class Subtraction 
{
	public static void main(String atrg[])
	{
		int num1,num2,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		sc.close();
		sub=num1-num2;
		System.out.println("The subtraction is "+sub);
	}
}
