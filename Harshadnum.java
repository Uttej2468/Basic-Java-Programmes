import java.util.*;
class Harshadnum
{
	public static void main(String args[])

	{	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=n;
	int s=0;
	while (n>0)
	{
    int r=n%10;
	s=s+r;
	n=n/10;
    }
	if(a%s==0)
	{

		System.out.println("it is  Harshadnum");
	}
	else
	{
		System.out.println("it is not Harshadnum");
	}
}
}