
import java.util.*;
class TestStringInput
{
	public static void main(String args[])
	{
				
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter String1");
		String n1=sc.nextLine();
		System.out.println("String1="+n1);
		System.out.println("Enter String2");
		String n2=sc.next();
		System.out.println("String2="+n2);
		System.out.println("Enter String3");
		String n3=sc.next();
		System.out.println("String3="+n3);
		System.out.println("String3 Length="+n3.length());
	}
}