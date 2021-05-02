import java.util.*;
class possibilities
{
static int c=0;
static int check( int a[] , int k)
	{

    for(int i=0 ;i<a.length;i++)
    {
     	if(a[i]==k)
    	{
    		c++;
    	}
    }
    return c;
    }

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    int a[]=new int[n];
    int k=sc.nextInt();
    for(int i=0 ;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
     int b=check(a,k);
    System.out.println(b);

}
}
	
 