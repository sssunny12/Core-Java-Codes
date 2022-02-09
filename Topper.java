import java.util.*;

class Topper
{
	public static void main(String args[])

	{

		Scanner scan = new Scanner(System.in);

		String a[][] = new String[3][2];
			
			a[0][0] = "Praveen singh";
			a[0][1] = "90";
			a[1][0] = "Anurag pandey";
			a[1][1] = "88";
			a[2][0] = "Shizan siddiqui";
			a[2][1] = "86";
		
			for(int i=0; i<3; i++)
			{
			for(int j=0; j<2; j++)
			{
			if(j==1)
			{
			int m = Integer.parseInt(a[i][j]);
			}

			
			if(a[0][1]>a[1][1] && a[1][1]>a[2][1])
			{
			System.out.println(a[0][0]);
			}
}
}
}
}