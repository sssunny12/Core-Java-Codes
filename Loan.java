class Loan
{
	public static void main(String args[])
	{
		double loan_amount = 100000;
		double interest = 12;
		double time = 2;
double interest_amount = loan_amount* (interest/100);
System.out.println("interest amount = " + interest_amount);
		double total = loan_amount + interest_amount * time;
		double emi = total/24;

		double emi_with_gst = emi + (emi / 100 * 18);

		System.out.println("Total = " + total);
		System.out.println("Emi = " + emi);
		System.out.println("Emi with gst = " + emi_with_gst);
		 
}
}