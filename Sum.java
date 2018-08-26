import java.util.Scanner;
public class Sum
{
	public static void main(String[] x)
	{
		System.out.println("Enter numbers");
		Scanner ip = new Scanner(System.in);
		
		int n1 , n2  , s;
		n1 = ip.nextInt();
		n2 = ip.nextInt();
		s = n1 + n2;
		System.out.println("The sum of " + n1 + " + " + n2 + " = " + s);
	}
}