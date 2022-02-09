class Average
{
	public static void main(String args[])
	{
		int maths = Integer.parseInt(args[0]);
		int physics = Integer.parseInt(args[1]);
		int chemistry = Integer.parseInt(args[2]);
		int english = Integer.parseInt(args[3]);
		int hindi = Integer.parseInt(args[4]);
		
		int totalmarks = maths + physics + chemistry + english + hindi;
		
		int averagemarks = totalmarks/5;
	
	System.out.println("Totak marks = " + totalmarks);
	
	System.out.println("Average marks = " + averagemarks); 
}
}