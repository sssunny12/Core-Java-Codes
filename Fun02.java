class Fun02
{
//defining the function
	public static void calculate(int a, int b)
	{
		int c=0;

		if(a >b)
		c=a/b;
		else if(a <b)
		c = a+b;
		else
		c = a-b;

		System.out.println("c = " + c);


	}

	public static void main(String args[])
	{
		int a=5;
		int b=10;
		calculate(a,b); //calling the function

		a = 20;
		b = 5;
		calculate(a,b);

		a = 20;
		b = 20;
		calculate(a,b);

	}
		
}