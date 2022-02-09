import java.util.Scanner;

class Password

{
	public static void main(String args[])

	{
		boolean special=false;
		boolean upper=false;
		boolean lower=false;
		boolean numb=false;
		
		

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the password: ");
		String pass = scan.nextLine();

		int i=0;
		
		while(i<pass.length())
		{
		
		
		if(pass.charAt(i)>=65 && pass.charAt(i)<=90)
			upper=true;
		
		if(pass.charAt(i)>=97 && pass.charAt(i)<=122)
			lower=true;

		if(pass.charAt(i)>=48 && pass.charAt(i)<=57)
			numb=true;

		if(pass.indexOf('@')>=0 || pass.indexOf('#')>=0 || pass.indexOf('%')>=0 || pass.indexOf('$')>=0 || pass.indexOf('&')>=0 || pass.indexOf('!')>=0 || pass.indexOf('*')>=0 || pass.indexOf('+')>=0 || pass.indexOf('-')>=0 || pass.indexOf('/')>=0 || pass.indexOf('_')>=0 || pass.indexOf('^')>=0 || pass.indexOf('=')>=0)

			special=true;
			
			i++;
			}
			
			
		if(special==true && upper==true && lower==true && numb==true && pass.length()>=8)
					{
					System.out.println("Strength: Very Strong");
					}

		else if(upper==true && lower==true && numb==true && pass.length()>=8)

					{
					System.out.println("Strength: Strong");
					}
		
		else if(lower==true || pass.length()<=7) 
					{
					System.out.println("Strength: Weak");
					}

}
}