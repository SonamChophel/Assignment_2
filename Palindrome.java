public class Palindrome
{
	public static void main(String[] x)
	{
		int n = 121;
		int temp = n;
		int r , sum = 0;
		while(temp != 0)
		{
			r = temp%10;
			sum = (sum * 10) + r;
			temp /= 10;
		}
		if(sum == n)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
}