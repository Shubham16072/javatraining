package Day3;

public class JOIN 
{

static int concat(int a,int b)
{
	String s1=Integer.toString(a);
	String s2=Integer.toString(b);
	String s=s1+s2;
	int c=Integer.parseInt(s);
	return c;
	
}


public static void main(String[] args) 
{
	int a=30;
	int b=50;
	System.out.println("The joined number is:	"+concat(a,b));	// TODO Auto-generated method stub
		
}
}