package swapObject;
class Car2
{
	int model,no;
	Car2(int model,int no)
	{
		this.model=model;
		this.no=no;
	}
	void print()
	{
		System.out.println("No = "+no+" Model = "+model);
	}
}
class CarWrapper
{
	Car2 c;
	CarWrapper(Car2 c)
	{
		this.c=c;
	}
}
public class Main2 
{
	public static void swap(CarWrapper cw1,CarWrapper cw2)
	{
		Car2 temp=cw1.c;
		cw1.c=cw2.c;
		cw2.c=temp;
	}
	public static void main(String[] args)
	{
		Car2 c1=new Car2(101,1);
		Car2 c2=new Car2(202,2);
		CarWrapper cw1=new CarWrapper(c1);
		CarWrapper cw2=new CarWrapper(c2);
		swap(cw1,cw2);
		cw1.c.print();
		cw2.c.print();
	}
}
