import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter
{
	public static void main(String args[])
{
	LocalDateTime ldt = LocalDateTime.now();

	System.out.println("Before Formatting: " + ldt);

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy  hh:mm:ss");

	String formattedDate  = ldt.format(dtf);

	System.out.println("After formatting: " + formattedDate); 
}
}