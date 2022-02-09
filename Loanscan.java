import java.util.Scanner;

class Loanscan
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		

		System.out.print("pricipal p: ");
		double p = scan.nextDouble();
		

		System.out.print("rate r: ");
		double r = scan.nextDouble();

		
		System.out.print("time t: ");
		double t = scan.nextDouble();

		
		double total = p + (r*p/100) * t ;


		double emi = total / (t*12);

		
		double gst = 18;


		double ewg = emi + (emi / 100 * gst); 
		

		System.out.println("Total = " + total);
		System.out.println("Emi = " + emi);
		System.out.println("Emi_with_gst = " + ewg);
		

  
}
}