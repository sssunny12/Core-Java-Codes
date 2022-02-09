class T
{
	int a=5;
	String name;
	boolean flag;

	//parameterized constructor
	T(int x, String y, boolean z)
	{
		a=x;
		name=y;
		flag=z;
	}

	//non parameterised constructor

	T()
	{
		a = 10;
		name = "Test";
		flag = true;
	}
	
}


class T1
{
	public static void main(String args[])
	{
		T obj = new T(5,"Praveen",true); //parametersize constructor called
		
		System.out.println(obj.a);
		System.out.println(obj.name);
		System.out.println(obj.flag);

		T obj2 = new T(6,"Aryan",false);
		
		System.out.println(obj2.a);
		System.out.println(obj2.name);
		System.out.println(obj2.flag);

		T obj3 = new T(); //non parametersize constructor called

		System.out.println(obj3.a);
		System.out.println(obj3.name);
		System.out.println(obj3.flag);


	}
}

