//First and Second Largest element in an Array
import java.util.*;
class FirstSecond2D
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=scan.nextInt();
		System.out.println("Enter the column size");
		int col=scan.nextInt();
		int a[][]=new int[row][col];

		System.out.println("Enter the values in a array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				a[i][j]=scan.nextInt();
			}
		}
		
		

		
		int temp=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=j;k<col;k++)
				{
					if(a[i][j]>a[i][k])
					{
						temp=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=temp;
					}
				}
									
			}
			
		}
		System.out.println("Ascending order");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");				
			}
			System.out.println();
		}
		 

		/*int temp1=0;
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				for(int k=j;k<row;k++)
				{
					if(a[j][i]>a[k][i])
					{
						temp1=a[j][i];
						a[j][i]=a[k][i];
						a[k][i]=temp1;
					}
				}
									
			}
			
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[i][j]+" ");				
			}
			System.out.println();
		}*/

		/////
		
		System.out.println("First Largest:"+a[row-1][col-1]);
		System.out.println("Second Largest:"+a[row-2][col-2]);				
			
	}
}