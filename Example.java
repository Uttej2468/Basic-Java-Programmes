import java.util.*;
class Example
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int n3=sc.nextInt();
		 int a=reverse(n1);
		 int b=reverse(n2);
		 int c=reverse(n3);
		 if(a>500)
		 	System.out.println(a);
		 if(b>500)
		 	System.out.println(b);
		 if(c>500)
		 	System.out.println(c);

		 
	}
public static int reverse(int m){
		int r,s=0;
	while(m>0)
		 {
		 	r=m%10;
		    s=s*10+r;
		    m=m/10;
		 }
		return(s);

}

}
