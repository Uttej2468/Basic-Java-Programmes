import java.util.*;
class Checkbinary
{
	public static void main(String args[])
	{
	int r,c=0,n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n>0)
	{
		r=n%10;
		if(r!=0 && r!=1)
	    c++;
	    n=n/10;
	}
	if(c==0)
	{
		System.out.println("it is binary format");
	}
	else
	{
	System.out.println("it is not binary format");
	
	 }
	}
}