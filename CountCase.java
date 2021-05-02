import java.util.*;
class CountCase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int u=0,l=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
				u++;
			else if(ch[i]>=97 && ch[i]<=122)
				l++;
		}
		System.out.println("Uppercase="+u);
		System.out.println("Lowercase="+l);
	}
}