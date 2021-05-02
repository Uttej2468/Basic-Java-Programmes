import java.util.*;
class FactorialRecursive
{
	static int fact(int n)
	{
		if(n==0)
		{
         return 1;
     }
     else 
     	return n*fact(n-1);
	}	
	public static void main(String args[])
	{
		
		//int n=4;	
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int r=fact(n) ;
		System.out.print(r);
	}
}