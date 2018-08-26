import java.util.Scanner;
public class PrimeNo
{
	public static void main(String[] x)
	{
		int n , i , f=0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number");
		n = ip.nextInt();
		
		for(i=2 ; i<=(n/2) ; i++)
		{
			if( n%i == 0){
				f = 1;
				break;
			}
		}
		
		if( f == 1)
		{
			System.out.println(n + " is not a prime number ");
		}
		else
		{
			System.out.println(n + " is prime number ");
		}
	}
}