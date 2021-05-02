import java.util.*;
class ColumnSum
{
	public static void main(String args[])
	{
		int m,n;
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{

			}
			c=c+a[i][0];
		}

	}
}