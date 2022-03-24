
public class Demo6 
{
	int i;
	String n;
	Demo6(int i,String n)
	{
		this.i=i;
 		this.n=n;
	}
	void display()
	{
		System.out.print(i+" "+n);
	}
	public static void main(String[] args)
	{
		Demo6 demo=new Demo6(5,"sonu");
		demo.display();
	}
}
