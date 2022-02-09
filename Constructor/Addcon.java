class Sum
{
	int a;
	int b;
	int c;
	int m;

	Sum(int x, int y)
	{
		a = x;
		b = y;
		c = a+b;
		m = a*b;
		
	}
}

class Addcon
{
	public static void main(String args[])	
	{
	Sum obj = new Sum(5,6);
	System.out.println(obj.c);

	Sum obj1 = new Sum(7,8);
	System.out.println(obj1.c);

	Sum obj2 = new Sum(5,6);
	System.out.println(obj2.m);

	Sum obj3 = new Sum(7,8);
	System.out.println(obj3.m);
}

}