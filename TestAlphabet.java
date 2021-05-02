import java.util.*;
class TestAlphabet
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int a=(int)ch;
		if(a>=65 && a<=90)
			System.out.println("Upper Case Letter");
		else if(a>=97 && a<=122)
			System.out.println("Lower case letter");
		else
			System.out.printf("Invalid");
	}
}