import java.util.*;
class MethodArray2D
{
	static int sumElement(int a[][])
	{
		int i,j,sum=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
			sum=sum+a[i][j];
			}
			
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int i,j;
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		System.out.println("Sum="+(sumElement(a));
			
	}
}