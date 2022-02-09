import java.util.Scanner;

class Ttswitch
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scan.nextInt();
        
       switch(x)
       {
           case 1:
           System.out.println("One...");
           break;
           case 2:
           System.out.println("Two...");
           break;
           default:
           System.out.println("Error! enter only 1 or 2...");
           break;
        }
    }

}
