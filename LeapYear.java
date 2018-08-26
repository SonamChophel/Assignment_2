import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] x)
	{
		System.out.println("Enter any year");
		Scanner ip = new Scanner(System.in);
		int year;
		year = ip.nextInt();
		
		if( year % 4 == 0 )
		{
			System.out.println(year + " is leap year.");
		}
		else
		{
			System.out.println( year + " is not a leap year.");
		}
	}
}