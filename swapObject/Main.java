package swapObject;
class Car
{
	int no;
	Car(int no)
	{
		this.no=no;
	}
}
public class Main 
{
	public static void swap(Car c1, Car c2)
	{
		int temp=c1.no;
		c1.no=c2.no;
		c2.no=temp;
	}
	public static void main(String[] args)
	{
		Car c1=new Car(1);
		Car c2=new Car(2);
		swap(c1,c2);
		System.out.println("C1.no = "+c1.no);
		System.out.println("C2.no = "+c2.no);
	}
}
