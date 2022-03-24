//Single inheritance
class Parent 
{
	void Demo()
	{
		System.out.println("Hello java");
	}
}
class Inheritance extends Parent 
{
	public static void main(String[] args)
	{
		Inheritance c=new Inheritance();
		c.Demo();
	}
}
