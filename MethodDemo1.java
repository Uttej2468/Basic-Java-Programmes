import java.util.*;
class MethodDemo1
{

	static double sumofN(double n)
	{
		
		int i,s=0;

		for(i=1;i<=n;i++)
			s=s+i;
		
		return s;

	}
	public static void main(String args[])
	{
		MethodDemo1 md1=new MethodDemo1();
		double a=sumofN(20);
		System.out.println(a);
	}
}