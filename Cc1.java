import java.util.*;
class Cc1
{
	public static void main(String args[])
	{
		int s=0,a=1,r,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int x=n;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			a=a*r;
			n=n/10;
		}
		System.out.println((s+a));
		System.out.println(n);
		if(x==(s+a))
		{
			System.out.println("Special number");
		}
		else 
		{
			System.out.println("its not a Special number");
		}
	}
}