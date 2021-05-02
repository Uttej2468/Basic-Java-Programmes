import java.util.*;
class Factorprime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c=0;
			if(n%i==0)
			{   //int c=0;
				for(int j=i;j>0;j--)

					if(i%j==0)
					{
						c=c+1;
					
					if(c==2)
					{
						System.out.println(j);
					}
				}
			}
		}
	}

}