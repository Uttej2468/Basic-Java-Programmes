import java.util.*;
class TestSum
{
	int sum()
	{
		int n;
		int i,s=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i+=2)
			s=s+i;
		return s;
	}
	public static void main(String args[])
	{
		TestSum ts=new TestSum();
		
		int s=ts.sum();
		System.out.println(s);
		
	}
}