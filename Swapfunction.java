class Swapfunction
{
	public static void main(String args[])
	{

		int a = 5;
		int b = 10;
		swap(a,b);

		a = 50;
		b = 40;
		swap(a,b);
}

		
		public static void swap(int a, int b)
		
		{
		int temp=0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);	
}
}