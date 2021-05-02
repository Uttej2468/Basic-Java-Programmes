import java.util.*;
class StringArray
{
	public static void main(String args[])
	{
		String str = "a,e,i,o,u"; // Converting String to String Array
		String[] vowels = str.split(",");
		for(int i=0;i<vowels.length;i++)
			System.out.println(vowels[i]);

		//Converting String array to String

		String[] vowels1 = { "a", "e", "i", "o", "u" };
		String s=Arrays.toString(vowels1);
		System.out.println(s);
	}
}