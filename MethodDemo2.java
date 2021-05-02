import java.util.*;
class MethodDemo2
{

	void ascending()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size for first array");
		int m=scan.nextInt(); 
		int[] a=new int[m];
		System.out.println("Enter the first array values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}

		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}

		System.out.println("The first array values after ascending order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The values are: "+a[i]);
		}
	}
	public static void main(String args[])
	{
		MethodDemo2 md2=new MethodDemo2();
		md2.ascending();

	}
}