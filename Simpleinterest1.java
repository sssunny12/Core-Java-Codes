class Simpleinterest1
{
	public static void main(String args[])
	{
		float p = Float.parseFloat(args[0]);
		float r = Float.parseFloat(args[1]);
		float t = Float.parseFloat(args[2]);
		float si = (p*r*t);
	System.out.println("Simple_interest = " + si);
}
}