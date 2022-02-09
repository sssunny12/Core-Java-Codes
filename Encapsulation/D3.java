class A //parent class
{
	protected int a;
}

class B extends A //child class
{
int b;
}

class C extends B
{
	int c;
}

class D3
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.a = 5;
		obj.b = 10;
		obj.c = 15;

		System.out.println(obj.a);	
		System.out.println(obj.b);	
		System.out.println(obj.c);	

	}
}