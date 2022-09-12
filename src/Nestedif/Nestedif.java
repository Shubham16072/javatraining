package Nestedif;
import java.util.Scanner;
public class Nestedif 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//enter a name
		System.out.println("Enter the frist name,middle name, last name of the person");
		String name=sc.nextLine();//taking the name input
		
		System.out.println(name);
		String arr[]=name.split(" ");
		//printing the initials of first and middle name and the entire last name
		System.out.println("Name of attendee: "+(arr[0].charAt(0)+" "+ arr[1].charAt(1) +" "+arr[2] ));
		
		System.out.println("Age of attendee: ");
		int age=sc.nextInt();//taking input of age and weight of attendee
		System.out.println("Weight of attendee: ");	
		int weight=sc.nextInt();
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("the person is eligible to donate blood ");
			}
			else
			{
				System.out.println("person is not eligible to donate blood ");
			
			}
		}
		else
		{
			System.out.println("age must be greater than 18 ");
		}
		}

}
