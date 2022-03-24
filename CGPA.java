import java.util.Scanner;
public class CGPA 
{
	public static void main(String[] args)
	{
		float s1,s2,s3,s4,s5,cgpa,par;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of subject one: ");
		s1=sc.nextFloat();
		System.out.println("Enter the marks of subject second: ");
		s2=sc.nextFloat();
		System.out.println("Enter the marks of subject third: ");
		s3=sc.nextFloat();
		System.out.println("Enter the marks of subject fouth: ");
		s4=sc.nextFloat();
		System.out.println("Enter the marks of subject fifth: ");
		s5=sc.nextFloat();
		cgpa=(s1+s2+s3+s4+s5)/50;
		par=(s1+s2+s3+s4+s5)/500*100;
		System.out.print("The marks in CGPA is "+cgpa);
		System.out.println();
		System.out.print("The precentage of marks is "+par);
	}
}
