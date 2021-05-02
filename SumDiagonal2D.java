//The sum of diagonal values

import java.util.*;
class SumDiagonal2D
{
		static int sum(int a[][],int row,int col)
		{
			int c=0;
			for(int i=0;i<row;i++)
			{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					c=c+a[i][j];
				}
								
			}
			
			}
			return c;
		}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=scan.nextInt();
		System.out.println("Enter the column size");
		int col=scan.nextInt();
		int a[][]=new int[row][col];

		System.out.println("Enter the values of an array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		int c=sum(a,row,col);
		
		System.out.println("The sum of diagonal value is: "+c);
	}
}