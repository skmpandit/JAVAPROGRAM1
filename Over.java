
public class Over 
{
	Over()
	{
		System.out.println("Hello");
	}
	Over(int a,int b)
	{
		System.out.println(a+b);
	}
	Over(float c,float d)
	{
		System.out.println(c+d);
	}
	public static void main(String[] args)
	{
		Over o=new Over();
		Over o2=new Over(12,14);
		Over o3=new Over(2.4f,4.2f);
	}
}
