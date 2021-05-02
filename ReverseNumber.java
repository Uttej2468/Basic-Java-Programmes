import java.util.*;
class ReverseNumber
{
	static int res=0;
	static int reverse(int num) //num=1436
	{
		//int res=0;
	int rem;
	if(num!=0)
	{
	rem=num%10;
	res=(res*10)+rem;
	num=num/10;
	reverse(num);
	}
	return res;
 	
	}
 
public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(reverse(n));//n=1436
	}
}