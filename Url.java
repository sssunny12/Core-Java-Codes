import java.util.Scanner;

class Url

{
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the URL: ");
		String url = scan.nextLine();

		int i=0;

		while(i<url.length())
		{
		i++;
		}

		if(url.startsWith("https") || url.startsWith("HTTPS"))
			
			System.out.println("the URL is secured");

		else if(url.startsWith("http") || url.startsWith("HTTP"))

			System.out.println("the URL is not secured");
 
}
}