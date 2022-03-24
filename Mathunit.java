public class Mathunit 
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String args[])throws Exception
	{
		Mathunit mu=new Mathunit();
		System.out.println(mu.add(5, 9));
		Mathunit.print("Static Method");
	}
	public static void print(String s) {}
}
