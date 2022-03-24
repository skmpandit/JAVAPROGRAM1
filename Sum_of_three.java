import java.util.Scanner;
public class Sum_of_three 
{
	public static  void main(String[] args)
	{
	int n1,n2,n3,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	n1=sc.nextInt();
	System.out.println("Enter the second number: ");
	n2=sc.nextInt();
	System.out.println("Enter the third number: ");
	n3=sc.nextInt();
	sum=n1+n2+n3;
	System.out.print("The addition is "+sum);
	}
}
