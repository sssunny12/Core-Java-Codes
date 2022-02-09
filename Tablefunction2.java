class Tablefunction2
{
	public static void main(String args[])
	{

		int a = 4;

		//creating object of the class

		Tablefunction2 obj = new Tablefunction2();

		obj.table(4);

		a = 5;
		obj.table(5);

		a = 10;
		obj.table(10);
}

	void table(int a)
	{

	for(int i=1; i<=10; i++)

	System.out.println(a + " x " + i + " = " + (a*i));
}
}