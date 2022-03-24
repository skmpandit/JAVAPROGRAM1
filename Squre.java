import java.util.Scanner;
public class Squre 
{
	public static void main(String[] args)
	{
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of squre: ");
		s=sc.nextInt();
		System.out.print("Area of squre: "+s*s);
		System.out.println();
		System.out.print("Perimeter of square is "+4*s);
	}
}
