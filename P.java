import java.util.*;
class P
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x==0 && y==0)
	{
		System.out.println("(0,0) is the origin");
	}
	else if(x>=0 && y>=0)
	{
		System.out.println("("+x + ","+y + ")" + "it is in the First Quadrant");
	}
	else if(x<=0 && y>=0)
	{
		System.out.println("("+x + ","+y + ")" + "it is in the Second Quadrant");
	}
	else if(x<=0 && y<=0)
	{
		System.out.println("("+x + ","+y + ")" + "it is in the Third Quadrant");
	}
	else if(x>=0 && y<=0)
	{
		System.out.println("("+x + ","+y + ")" + "it is in the Fourth Quadrant");
	}
   
	}
}