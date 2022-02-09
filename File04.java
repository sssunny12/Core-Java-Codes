import java.io.*;

class File04
{
	public static void main(String args[])
	throws IOException
	{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);

		System.out.print("Enter the message: ");
		String message = br.readLine();

		BufferedWriter writer = new BufferedWriter(new FileWriter("c://tanu//sunny.txt"));

		writer.write(message);
		writer.close();

		System.out.print("Content saved");


}
}