import java.util.Scanner;
public class division 
{
	public static void main(String args[])
	{
		int div,num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		sc.close();
		div=num1/num2;
		System.out.println("The division is "+div);
	}
}
