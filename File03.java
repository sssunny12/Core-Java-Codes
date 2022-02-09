import java.io.*;

class File03
{
		public static void main(String args[])
		{
		try
		{
	
		FileReader reader = new FileReader("c:\\tanu\\Circle.java");

		int character;
		{
		while((character = reader.read()) != -1)

		System.out.print((char) character);
		}

		reader.close();
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
		finally
		{
		System.out.println("done!");
		}
		


}
}