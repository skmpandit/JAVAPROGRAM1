import java.util.Scanner;
public class Multiplication 
{
	public static void main(String args[])
	{
		int num1,num2,mul;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		sc.close();
		mul=num1*num2;
		System.out.println("The multiplication is "+mul);
	}
}
