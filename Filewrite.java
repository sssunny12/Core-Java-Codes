import java.io.*;

class Filewrite
{
		public static void main(String args[])
		throws IOException
		{

		InputStreamReader io = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(io);

		System.out.print("Enter the message: ");
		String message = br.readLine();

		BufferedWriter writer = new BufferedWriter(new FileWriter("c:/tanu/sunny.txt"));
		writer.write(message);
		writer.close();

		System.out.println("Content saved");



}
}