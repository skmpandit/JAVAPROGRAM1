class Demon
{
	int a=10;
	int b=30;
	void show()
	{
		System.out.println(a+" "+b);
	}
}
class AA extends Demon
{
	void display()
	{
		System.out.println("In class A");
	}
}
public class BB extends Demon
{
	void details()
	{
		System.out.println(" In class B");
	}
	public static void main(String[] args)
	{
		AA a=new AA();
		BB b=new BB();
		a.display();
		b.details();
		a.show();
	}
}
