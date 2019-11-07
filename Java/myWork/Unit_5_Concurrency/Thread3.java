class First extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("First");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
			}
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		try
			{
				Thread.sleep(250);
			}
		catch (Exception e){
      System.out.println("Exception1");
		}
		for (int i=0;i<10;i++) {
			System.out.println("Second");
			try {
				Thread.sleep(900);
			}
			catch (Exception e){
         System.out.println("Exception2");
			}
		}
	}
}

public class Thread3 {
	public static void main(String[] args) {
		First ob1= new First();
		Second ob2= new Second();

		ob1.start();
		ob2.start();

	}
}
