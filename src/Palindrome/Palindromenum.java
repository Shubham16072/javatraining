package Palindrome;
import java.util.Scanner;
public class Palindromenum 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r,n,sum=0,temp;
		System.out.println("Enter a number");
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not a palindrome number");
	}

}
