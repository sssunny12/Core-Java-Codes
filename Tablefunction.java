class Tablefunction
{
	public static void main(String args[])
	{

		int a = 4;
		table(4);

		a = 5;
		table(5);

		a = 10;
		table(10);
}

	public static void table(int a)
	{

	for(int i=1; i<=10; i++)

	System.out.println(a + " x " + i + " = " + (a*i));
}
}