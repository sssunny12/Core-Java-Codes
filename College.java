import java.util.*;

class MBA
{
	void Detail(String sn, String si, String fn, String p)
	{
	System.out.println("Student name = " + sn);
	
	System.out.println("Student id = " + si);
	
	System.out.println("Father's name = " + fn);
	
	System.out.println("Programme = " + p);
}
}

class BBA extends MBA
{
}

class MCA extends BBA
{
}

class BCA extends MCA
{
}



class College
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the student name:");
		String sn = scan.nextLine();

		System.out.print("Enter the student id:");
		String si = scan.nextLine();

		System.out.print("Enter the father's name:");
		String fn = scan.nextLine();

		System.out.print("Enter the pragramme:");
		String p = scan.nextLine();	


		BCA obj = new BCA();
		obj.Detail(sn,si,fn,p);
	
}
}