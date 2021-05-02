import java.util.*;
class Addprimefactors
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=n;i>0;i--)
	{
		int c=0;
    if(n%i==0)
    	
    	for(int j=1;j<=i;j++)
    	{
    		if(i%j==0)
    	    c++;
            if(c==2)
            	
                System.out.println(j);
        }
            }
            }
    	}
	
	
