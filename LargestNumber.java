import java.util.Scanner;
public class LargestNumber
{
	public static void main(String[] x)
	{
		System.out.println("Enter 3 numbers");
		Scanner ip = new Scanner(System.in);
		int n1 , n2 , n3 ; 
		n1 = ip.nextInt();
		n2 = ip.nextInt();
		n3 = ip.nextInt();
		if( n1==n2 && n1==n3 && n2==n3 ){
			System.out.println("All numbers are equal.");
		}
		else
		{
			if( n1 > n2 ) {
				if(n1 > n3) {
					System.out.println(n1 + " is largest number.");
				}
				else {
				System.out.println(n3 + " is largest number.");
				}
			}
			else {
				if( n2 > n3 ){
					System.out.println( n2 + " is largest number.");
				}
				else{
					System.out.println(n3 + " is largest number.");
				}
			}
		}
	}
}