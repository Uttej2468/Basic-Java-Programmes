import java.util.*;
class MaxMin
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
		}
		int max=a[0];
		for(int i=1;i<size;i++)
		{
			if (max<a[i])
				max=a[i];
		}
		int min=a[0];
		for(int i=1;i<size;i++)
		{
			if (min>a[i])
				min=a[i];
		}
		System.out.println("The max value is"+max);
		System.out.println("The min value is"+min);

	}
}