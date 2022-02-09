class Votingf
{
	public static void main(String args[])
	{

	
		int a = 18;
		voting(a);

		a = 17;
		voting(a);

		a = 16;
		voting(a);

		a = 19;
		voting(a);

		a = 20;
		voting(a);
}
	public static void voting(int a)
	{
		if(a>=18)
		{
		System.out.println(a + " The person can vote");
		}
		
		else if(a<18)
		{
		System.out.println(a + " The person cannot vote");
		}



}
}