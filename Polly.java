class A
{
int sum(int a, int b)
{
return a+b;
}

String sum(String a, String b)
{
return a+b;
}
}

class Polly
{
public static void main(String args[])
{
A obj = new A();
int r=obj.sum(5,10);
System.out.println(r);

String s=obj.sum("hello","user");
System.out.println(s);
}
}
