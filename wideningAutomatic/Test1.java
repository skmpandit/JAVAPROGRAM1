package wideningAutomatic;
									/* Byte -> Short -> Int -> Long -> Float -> Double*/
public class Test1 
{
	public static void main(String[] args)
	{
		int i=10;
		long l=i;
		float f=l;
		double d=f;
		System.out.println("Integer value: "+i);
		System.out.println("Long value: "+l);
		System.out.println("Float value: "+f);
		System.out.println("Double value: "+d);
	}
}
