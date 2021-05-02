import java.util.*;
class Fact
{
	public static void main(String args[])
{
	int n,f=1;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++){

	f=f*i;
	}
	System.out.println("factorial="+f); 
}
}