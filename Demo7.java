import java.util.Scanner;
public class Demo7 
{
	void show()
	{
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		System.out.print("Enter the employee id:");
		id=sc.nextInt();
		System.out.print("Enter the employee name:");
		name=sc.next();
		sc.close();
		System.out.println(id+" "+name);
	}
	void show2()
	{
		this.show();
		System.out.println("congratulation");
	}
	public static void main(String[] args)
	{
		Demo7 d=new Demo7();
		d.show2();
	}
}
