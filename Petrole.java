import java.util.*;
class Petrole
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b[]=new int[a];
		int d[]=new int[a];
		int x[]=new int[a];
		int s[]=new int[a];
		for(int i=0;i<a;i++)
		{
			 b[i]=sc.nextInt();
		}
		 for(int i=0;i<a;i++)
		{
			 d[i]=sc.nextInt();
		}
		 for(int i=0;i<a;i++)
		{
			 if(n>=d[i])
			 int  y=n+b[i]-d[i];
			 for(int i=0;i<a+1;i++)
             
			if(y>=d[i+1])
			  s[i]=y+b[i]-d[i];
			System.out.println(s[i]);
		 }
		 


	}
}