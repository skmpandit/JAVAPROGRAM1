import java.util.Scanner;
public class Centigrade 
{
	public static void main(String[] args)
	{
		float fah,cen;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temprature in celsius : ");
		cen=sc.nextFloat();
		fah=(1.8f*cen)+32;
		System.out.print("Temprature in fahrenheit : "+fah);
	}
}
