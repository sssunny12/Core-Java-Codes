class MyThread extends Thread
{ 
Thread t; 

MyThread(String threadname) 
	{ 
		name = threadname; 
		t = new Thread(this, name); 
		System.out.println("New thread: " + t); 
		exit = false; 
		t.start(); // Starting the thread 
	} 
	public void run()
	{
		
	try
	{
		
	
			for(char i=65; i<=74; i++)
			{
			
			System.out.println(i);
	
			Thread.sleep(502);
			}
			}
			catch(Exception ex)		
			{
			}

		}
public void stop();

	}



class MyThreadTable
{
	public static void main(String args[]) throws InterruptedException
	{

			MyThread obj = new MyThread();
			obj.start();
		
			for(int j=1; j<=10; j++)
			{
			System.out.println(2 + " * " + j + " = " + (2*j));
				Thread.sleep(500);
			}
			



}

}