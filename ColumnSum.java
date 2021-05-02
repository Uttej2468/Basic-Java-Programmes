import java.util.*;
class ColumnSum
{
	public static void main(String args[])
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int c=0;
		for(int i=0;i<m;i++)
		{c=0;
			for(int j=0;j<n;j++)
			{
			c=c+a[j][i];
			}
			System.out.println("Sum of " + (i+1) + " column =" + c);
			//k++;
		}
	}
}