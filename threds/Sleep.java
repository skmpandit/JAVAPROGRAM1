package threds;

public class Sleep extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Sleep s=new Sleep();
		Sleep s1=new Sleep();
		s.start();
		s1.start();
	}
}
