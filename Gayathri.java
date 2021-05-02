import java.util.*;
class Gayathri
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0,r;
	for(int i=1;i<=n;i++)
	{
		s=s+(2*i)-1;
	}
	System.out.println(s);
	}
}