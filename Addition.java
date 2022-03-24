import java.util.Scanner;
public class Addition 
{
	public static void main(String args[])
	{
		int num1,num2,add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		sc.close();
		add=num1+num2;
		System.out.println("The addition is "+add);
	}
}
