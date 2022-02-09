import java.util.Scanner;

class Addswitch
{
    public static void main(String args[])
    {
		double number1, number2, result;
	
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter operator (either +, -, *, or /): ");
        char operator = scan.next().charAt(0);

	System.out.print("Enter number1 and number2 respectively: ");
	number1 = scan.nextDouble();
	number2 = scan.nextDouble();

    
       switch(operator)
       {
           case '+':
		result = number1 + number2;
           System.out.println("Result = " + result);
           break;
           case '-':
		result = number1 - number2; 
           System.out.println("Result = " + result);
           break;
           default:
		System.out.println("invalid operator!");
	   break;
          
        }
    }

}
