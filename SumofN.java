import java.util.*;
class SumofN
{
	public static void main(String args[])
	{
		int n,sum=0,i=1;

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
}