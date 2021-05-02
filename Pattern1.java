import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int x=1,y=n-1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				for(int j=y;j>0;j--)
				{
					System.out.print("#");
				}
				for(int b=0;b<x;b++)
					
					{
						System.out.print("*");
					}
				
			}
			else
			{
				for(int a=0;a<x;a++)
				{
				System.out.print("*");
				}
				for(int j=y;j>0;j--)
				{
				System.out.print("#");
				}
				
				
			}
			if(i>=(n/2)+1)
		{
        	y++;
			x--;
		}
			else 
			{
			   x++;
			   y--;
			}
			System.out.println("");
		}
	}
}
