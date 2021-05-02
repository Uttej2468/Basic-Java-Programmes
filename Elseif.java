import java.util.*;
class Elseif
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("enter a value");
	a=sc.nextInt();
	System.out.println("enter b value");
	b=sc.nextInt();
	System.out.println("enter c value");
	c=sc.nextInt();
	if(a>b && b>c)
	System.out.println(" enter a is greatest");
else if(b>a && a>c)
	System.out.println("enter b is greatest");
else
	System.out.println("enter c is greatest");
	}
}