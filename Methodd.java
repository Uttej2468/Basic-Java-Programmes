import java.util.*;
class MethodDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int n3=sc.nextInt();
		 reverse(n1);
		 reverse(n2);
		 reverse(n3);

		 
	}
public static void reverse(int m){
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
