
class A
{
	String name;
	int marks;

public void setName(String name)
{
this.name = name;
}
public void setMarks(int marks)
{
this.marks = marks;
}

public String getName()
{
return name;
}

public int getMarks()
{
return marks;
}
	
	
}

class B

{
public static void main(String args[])
{

A obj = new A();
obj.setName("praveen");
obj.setMarks(20);
System.out.println(obj.getName());
System.out.println(obj.getMarks());
}
}