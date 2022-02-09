
class Tablefunction3
{
	public static void main(String args[])
	{

		int a = 4;

		//creating object of the class

		//Tablefunction2 obj = new Tablefunction2();

		TableGen.table(4);

		a = 5;
		TableGen.table(5);

		a = 10;
		TableGen.table(10);
	}

}

class TableGen
{
	public static void table(int a)
	{

	for(int i=1; i<=10; i++)

	System.out.println(a + " x " + i + " = " + (a*i));
}

}