import java.util.*;
class AddTest
{
	int add(int a,int b)
	{
	System.out.println(a+b);
	return 0;
	}
	double add(int a,int b,int c)
	{
		return 1;
	}

	public static void main(String args[]){

		AddTest ad=new AddTest();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(ad.add(a,b));
		System.out.println(ad.add(a,b,c));
	}
}