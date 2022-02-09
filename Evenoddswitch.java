import java.util.Scanner;

class Evenoddswitch
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        
       switch(x%2)
       {
           case 0:
           System.out.println("Even...");
           break;
           case 1:
           System.out.println("Odd...");
           break;
           default:
           System.out.println("Error! enter only 1 or 2...");
           break;
        }
    }

}
