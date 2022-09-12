package day2;

import java.util.Scanner;

public class Shubham1 {

	public static void main(String[] args) 
	{
		float eng,phy,chem,math,comp;		//variable declaration
		double total,average,percentage;	//variable declaration
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of all the subjects");
		System.out.println("enter the marks of english");
		eng=sc.nextFloat();
		System.out.println("enter the marks of physics");
		phy=sc.nextFloat();
		System.out.println("enter the marks of chemistry");
		chem=sc.nextFloat();
		System.out.println("enter the marks of maths");
		math=sc.nextFloat();
		System.out.println("enter the marks of chemistry");
		comp=sc.nextFloat();
		total=eng+phy+chem+math+comp;
		average=(total/5);
		percentage=(total/500)*100;
		System.out.println("total="+total);
		System.out.println("average="+average);
		System.out.println("percentage="+percentage);
	}
		// TODO Auto-generated method stub

	}


