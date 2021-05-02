import java.util.*;
class Comparision_of_Strings
{
	public static void main(String args[])
	{
	String s=" uttej";
	String a="  uttej is developer   ";	
	System.out.println(a.equals(s));
	System.out.println(a.compareTo(s));
	System.out.println(a==s);
	System.out.println(a.concat(s));
	System.out.println(a.substring(3));
	System.out.println(a.substring(0,3));
	System.out.println(s.indexOf("uttej" , 7 ));
	System.out.println(a.replaceAll(" ",""));
	System.out.println(a.trim());
	}
}