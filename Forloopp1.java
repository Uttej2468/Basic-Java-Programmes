import java.util.*;
class Forloopp1
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			for(i=0;i>n;i--)
		{
			for(j=n-i;j<0;j++)
			{
				System.out.print(" ");
			}
			for(k=n;k>=i;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
