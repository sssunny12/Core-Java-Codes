import java.util.Scanner;

class Discount
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the product quantity: ");
		int quantity = scan.nextInt();
		
		double cost_per_unit = 100;

		if(quantity>1000)
{
		double discount = quantity*cost_per_unit*.10;		
		System.out.println("discount: " + discount);
		double total_cost = quantity*cost_per_unit-discount;
		System.out.println("Total cost = " + total_cost);
}

		else
{
		double total_cost = cost_per_unit*quantity;
		System.out.println("Total cost = " + total_cost);

			System.out.println("No discount");
}

		}
		
}