class Circle
{
	String shape(int a)

{
	return ("Circle = " + 3.14*a*a);
}
}

class Rectangle extends Circle
{
	String shape(int a)
{
	return ("Rectangle = " + a);
}
}

class Square extends Circle
{
	String shape(int a)

{
	return ("Square = " + a*4);
}
}

class Shapes
{
	public static void main(String args[])

	{
		Circle obj; //poly morph

		obj = new Square();
		String r = obj.shape(4);
		System.out.println(r);

		obj = new Rectangle();
		r = obj.shape(4);
		System.out.println(r);

		obj = new Circle();
		r = obj.shape(4);
		System.out.println(r);




	}
}