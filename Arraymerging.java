import java.util.*;
class Arraymerging
{	
	public static int[] sort(int a[])
	{
		int x;
		for (int i=0;i<a.length;i++)
		{
          x=a[0];
          if(x>a[1])
          	x=a[i];
		}
		return a
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int a[]=new int[m];
	int b[]=new int[n];
	int c[]=new int[m+n];
	for(int i=0;i<m;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n;j++)
	{
		b[j]=sc.nextInt();
	}
	System.out.println(sort(a));
	}
}