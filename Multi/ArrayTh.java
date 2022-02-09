class Arrayt implements Runnable
{
	String arr[];

	public Arrayt()
	{
		arr = new String[5];
arr[0]="ram";
arr[1]="syam";
arr[2]="shyam";
arr[3]="gopal";
arr[4]="karan";
	}

		public void run()
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}


		}
}
class ArrayTh
{

	public static void main(String args[])
	{
		Arrayt obj = new Arrayt();
		ArrayT obj1 = new ArrayT();

		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj);
		Thread t3 = new Thread(obj1);

		t.start();
		t1.start();
		t3.start();
}
}