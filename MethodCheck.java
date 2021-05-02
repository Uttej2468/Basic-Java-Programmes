import java.util.*;
class MethodCheck
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		//int n=s.nextInt();
		int n=s.next
		Int();
		reverse(n);

	}

		public static void reverse(int m)
		{
			int r,s=0;
			while(m>0)
			{
				r=m%10;
				s=s*10+r;
				m=m/10;
			}
		System.out.println(s);
	    }
}