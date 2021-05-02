import java.util.*;
class BinaryCheck
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=0,r;
	while(n>0)
	{
	r=n%10;
	if(r!=0 && r!=1)
		c++;
	n=n/10;
	}
	System.out.println(c);
	
	if(c==0)
		System.out.println("Binary format");
	else
		System.out.println("Not in a Binary format");
}
}