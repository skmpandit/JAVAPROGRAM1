import java.util.Scanner;
public class S_hello 
{
	public static void main(String[] args)
	{
		System.out.print("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Hello "+name+" how are you today");
	}
}
