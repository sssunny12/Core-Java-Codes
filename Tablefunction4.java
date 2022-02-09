
class TableGen
{
	public void table(int a)
	{

	for(int i=1; i<=10; i++)

	System.out.println(a + " x " + i + " = " + (a*i));
	}

}

class Tablefunction4
{
	public static void main(String args[])
	{

		int a = 4;

		//creating object of the class

		TableGen obj = new TableGen();

		obj.table(4);

		a = 5;
		obj.table(5);

		a = 10;
		obj.table(10);
	}

}

