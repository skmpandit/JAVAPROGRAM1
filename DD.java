
class X 
{
	void show()
	{
		System.out.println("Hello");
	}
}
class P extends X
{
	void Demo()
	{
	System.out.println("Hi");
	}
}
class Q extends P
{
	void demo1()
	{
		System.out.println("Good morning");
	}
}
class DD extends Q
{
	public static void main(String[] args)
	{
		DD obj=new DD();
		obj.show();
		obj.Demo();
		obj.demo1();
	}
	
}