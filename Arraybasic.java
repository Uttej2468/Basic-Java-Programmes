import java.util.*;
class Sumofarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		//int n=sc.nextInt();
		//int a[][]=new int[n][n];
		int s=0;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				s=s+a[i][j];
			}
			System.out.println();
		}

	}
}