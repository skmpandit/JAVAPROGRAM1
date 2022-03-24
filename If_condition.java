import java.util.Scanner;
public class If_condition 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What is you age: ");
		int age=sc.nextInt();
		if(age!=18)
		{
			System.out.println("You can drive a car");
		}
	}
}
