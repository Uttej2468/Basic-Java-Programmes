import java.util.*;
class Countstring
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=s.toLowerCase();
	int a=0,b=0,c=0;
	for(int i=0;i<s.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch>='0' && ch<='9')
		{
			a=a+1;
		}
		else if(ch>='a'&& ch<='z')
		{

			b=b+1;
		}
		else if(ch==' '){
			c=c+1;
		}
	}
	System.out.println("digits :"+a);
	System.out.println("spaces :"+c);
	}
}