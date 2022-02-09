class A
{
	int sum(int a, int b)
	{
		return a+b;
	}

}

class B extends A
{
int sum(int a, int b)
	{
		return a-b;
	}
}

class Poly1
{
	public static void main(String  args[])
	{
		B obj = new B();
		int r = obj.sum(5,10);
		System.out.println(r);

	}
}