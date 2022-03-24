package threds;

public class Multi1 implements Runnable
{
	public void run()
	{
		System.out.println("Running thread method");
	}
	public static void main(String[] args) {
		Multi1 m=new Multi1();
		Thread t1=new Thread(m);
		t1.start();
	}
}
