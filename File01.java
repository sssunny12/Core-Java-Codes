import java.io.*;

class File01
{
	public static void main(String args[])
	throws IOException{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);

	System.out.print("Enter character: ");
	char a = (char)br.read();

	
	System.out.println(a);



}
}