import java.util.*;
public class Sonu
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1,h=n-1;
		for(int i=1;i<=n;i++)
		{
		    if(i%2==0)
		    {
		        for(int k=1;k<=h;k++)
		        System.out.print("#");
		        for(int k=1;k<=s;k++)
		        System.out.print("*");
		    }
		    else
		    {
		        for(int k=1;k<=s;k++)
		        System.out.print("*");
		        for(int k=1;k<=h;k++)
		        System.out.print("#");
		    }
		    if(i>=((n-1)/2)+1)
		    {
		        h++;
		        s--;
		    }
		    else
		    {
		        s++;
		        h--;
		    }
		    System.out.println();
		}
	}
}