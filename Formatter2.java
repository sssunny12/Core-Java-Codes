import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter2
{
	public static void main(String args[])
	{
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println("Before Formatting: " + ldt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy  hh:mm:ss");

		String Formatted = ldt.format(dtf);

		System.out.println("After Formatting: " + Formatted);
	}
}