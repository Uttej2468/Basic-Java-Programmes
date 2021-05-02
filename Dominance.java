import java.util.*;
class Dominance
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt(); 
    int n=sc.nextInt();
    int a=0,b=0;
    
    for(int i=1;i<=m;i++)
    {
    	if(m%i==0)
    	{
        a=a+i;
        System.out.println(i);
    	}
    }
     for(int i=1;i<=n;i++)
    {
    	if(n%i==0)
    	{
        b=b+i;
    	}
    }
    if(a>b)
    {
    	System.out.println("dominance");
    }
	}
	
}