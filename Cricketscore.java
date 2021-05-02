import java.util.*;
class Cricketscore
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[][]=new String[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.next();
			}
		}
		String b=a[0][1];
		String c="";
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(a[i][1].compareTo(b)>0)
				c=a[i][1];

			}
		}
		System.out.println(a[i][0]+" "+c);
	}
}