import java.util.Scanner;
public class Result 
{
	public static void main(String[] args)
	{
		int m1,m3,m2,m4,m5,total;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of five subject:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		sc.close();
		total=m1+m2+m3+m4+m5;
		per=(total*100)/500;
		if(per>=90)
		{
			System.out.println("Grade O");
		}
		else if(per>=80&&per<90)
		{
			System.out.println("Grade E");
		}
		else if(per>=70&&per<80)
		{
			System.out.println("Grade A");
		}
		else if(per>=60&&per<70)
		{
			System.out.println("Grade B");
		}
		else if(per>=50&&per<60)
		{
			System.out.println("Grade C");
		}
		else if(per>=40&&per<50)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
