import java.util.*;
class ArrayDemo
{
	public static void main(String args[])
	{
		int a[]=new int[6];
		int sum=0,avg;
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<6;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<6;i++)
			sum=sum+a[i];
			avg=sum/6;
			System.out.println(avg);

	}
}