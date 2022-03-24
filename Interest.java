import java.util.Scanner;
public class Interest 
{
	public static void main(String[] args)
	{
		float p,r,t,cp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the pricipal amount : ");
		p=sc.nextFloat();
		System.out.print("Enter the interest rate : ");
		r=sc.nextFloat();
		System.out.print("Enter the time : ");
		t=sc.nextFloat();
		sc.close();
		cp=p*pow((1+r/100),t)-p;
		System.out.print("Compound interest is ="+cp);
	}

	private static float pow(float f, float t) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
