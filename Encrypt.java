import java.util.Scanner;

class Encrypt

{
	public static void main(String args[])

	{
		String News="";		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String s = scan.nextLine();
		
		int i=0;

		while(i<s.length())
		{
		
		char ch = (s.charAt(i));

		switch(ch)
		{
		case 'a':
			News = News+ "+";
		break;
		
		case '+':
			News = News+ "a";
		break;
		
		case 'b':
			News = News+ "-";
		break;

		case '-':
			News = News+ "b";
		break;

		case 'c':
			News = News+ "*";
		break;

		case '*':
			News = News+ "c";
		break;
		
		case 'd':
			News = News+ "/";
		break;
		
		case '/':
			News = News+ "d";
		break;
		
		case 'e':
			News = News+ "!";
		break;
		
		case '!':
			News = News+ "e";
		break;
		
		case 'f':
			News = News+ "@";
		break;
		
		case '@':
			News = News+ "f";
		break;

		case 'g':
			News = News+ "#";
		break;
		
		case '#':
			News = News+ "g";
		break;
		
		case 'h':
			News = News+ "%";
		break;
		
		case '%':
			News = News+ "h";
		break;

		case 'i':
			News = News+ "^";
		break;
		
		case '^':
			News = News+ "i";
		break;
		
		case 'j':
			News = News+ "&";
		break;
		
		case '&':
			News = News+ "j";
		break;

		case 'k':
			News = News+ "(";
		break;
		
		case '(':
			News = News+ "k";
		break;
		
		case 'l':
			News = News+ ")";
		break;
		
		case ')':
			News = News+ "l";
		break;
		
		case 'm':
			News = News+ "_";
		break;
		
		case '_':
			News = News+ "m";
		break;
		
		case 'n':
			News = News+ ",";
		break;
		
		case ',':
			News = News+ "n";
		break;

		case 'o':
			News = News+ "=";
		break;
		
		case '=':
			News = News+ "o";
		break;
		
		case 'p':
			News = News+ "{";
		break;
		
		case '{':
			News = News+ "p";
		break;

		case 'q':
			News = News+ "0";
		break;
		
		case '0':
			News = News+ "q";
		break;
		
		case 'r':
			News = News+ "9";
		break;
		
		case '9':
			News = News+ "r";
		break;

		case 's':
			News = News+ "8";
		break;
		
		case '8':
			News = News+ "s";
		break;
		
		case 't':
			News = News+ "7";
		break;
		
		case '7':
			News = News+ "t";
		break;
		
		case 'u':
			News = News+ "6";
		break;
		
		case '6':
			News = News+ "u";
		break;
		
		case 'v':
			News = News+ "5";
		break;
		
		case '5':
			News = News+ "v";
		break;

		case 'w':
			News = News+ "4";
		break;
		
		case '4':
			News = News+ "w";
		break;
		
		case 'x':
			News = News+ "3";
		break;
		
		case '3':
			News = News+ "x";
		break;

		case 'y':
			News = News+ "2";
		break;
		
		case '2':
			News = News+ "y";
		break;
		
		case 'z':
			News = News+ "1";
		break;
		
		case '1':
			News = News+ "z";
		break;
		default:
			News = News+ "invalid";
		break;

			
		}

		i++;
		}
			System.out.println("The encrypted string is:" + News);
			

		


		

}
}