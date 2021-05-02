import java.util.*;
class Bin
{
	public static void main(String args[])
	{
		int n,b=0,i=1; 
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n>0){
    b=b+(n%2)*i;
    i=i*10;
n=n/2;
}
    System.out.println(b);
    }
}
