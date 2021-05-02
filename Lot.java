
import java.util.*;
class Lot
{
	public static void main(String args[])
	{
	int n1,n2,a,b,c,d;
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	a=n1%10;
	b=n1/10;
	c=n2%10;
	d=n2/10;
	if (a==c || a==d)
	{
		System.out.println("u won");
	}
	else if (b==c || b==d)
	{
	System.out.println("u won");
    }
	else 
	{
		System.out.println("fucked up");
	}



	}

}