import java.util.Scanner;
public class Rectangle
{
	public static void main(String[] args)
	{
		int len,bre,area,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		len=sc.nextInt();
		System.out.print("Enter the bredth of rectangle:");
		bre=sc.nextInt();
		area=len*bre;
		perimeter=2*(len+bre);
		System.out.print("The area of rectangle is "+area);
		System.out.println();
		System.out.print("The perimeter of rectangle is "+perimeter);
	}
}
