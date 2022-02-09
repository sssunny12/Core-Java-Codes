
class Array300
{
	public static void main(String args[])
	{
		String names[][] = new String[2][2];

		names[0][0] = "Ram";
		names[0][1] = "1010";
		names[1][0] = "Shyam";
		names[1][1] = "1011";

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(names[i][j]);
			}
		//System.out.println();
		}

	}
}
