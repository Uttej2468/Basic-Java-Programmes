import java.util.*;
class Dectooctal
{
	public static void main(String args[])
	{
		int r,s=0,i=1,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 while(n>0)
		 {
		 r=n%10;
		 s=s+r*(int)(Math.pow(2,i));
		 i++;
		 n=n/10;	
		 }
		 
		 int  a=s;
		 i=1;
		 		while(s>0)
	     {
		 	a=a+(s%8)*i;
		 	i=i*10;
		 	s=s/8;
		 }
		 System.out.println(a);
	}
}