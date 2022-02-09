import java.io.*;

class File02
{
	public static void main(String args[])
	throws IOException{

	FileReader reader = new FileReader("c:\\tanu\\Circle.java");

	int character;

		while((character = reader.read()) != -1)
		{

		System.out.print((char) character);
		}
	
		reader.close();




}
}