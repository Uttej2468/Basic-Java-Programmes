import java.util.*;
class Cc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int a=1;
		int s=0;
		while(n>0)
		{
			int r=n%10;
			s=s+r;
			a=a*r;
			n=n/10;
		}
		
		//System.out.print(a);
		//b=s+a;
		//int x=n;
		if(x==(s+a))
		{
		  System.out.println("Special number");
		}
		else 
		{
		System.out.print("its not a Special number");
		}
	}
}