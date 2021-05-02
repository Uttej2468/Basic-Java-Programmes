import java.util.*;
public class StringSort {
   public static void main(String []args) {
   	Scanner sc=new Scanner(System.in);
   	int n=sc.nextInt();
	String str[] = new String[n];
	String temp;
	for(int i=0;i<n;i++)
		str[i]=sc.next();
	
	for (int i = 0; i < str.length; i++) {
   	   for (int j = i + 1; j < str.length; j++) {
		System.out.println(str[i].compareTo(str[j]));
		if (str[i].compareTo(str[j]) < 0) {
			temp = str[j];
			str[j] = str[i];
			str[i] = temp;
		}
	   }
	  }

	  for(int i=0;i<str.length;i++)
	    System.out.println(str[i]);
   }
}