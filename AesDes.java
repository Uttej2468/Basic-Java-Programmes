import java.util.*;
class AesDes
{
	public static void main(String[] args)
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
		
		System.out.println("Enter the size for second array");
		int n=scan.nextInt();
		int[] b=new int[n];
		System.out.println("Enter the Second array values");
		for(int j=0;j<b.length;j++)
		{
			b[j]=scan.nextInt();
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
		
		int temp1=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					temp1=b[i];
					b[i]=b[j];
					b[j]=temp1;
				}
			}
		}

		System.out.println("The Second array values after Decending");
		for(int i=0;i<b.length;i++)
		{
			System.out.println("The values are: "+b[i]);
		} 

		int[] c=new int[m+n];
		int count=0;
		 for(int i=0;i<m;i++)
		 {
		 	c[count]=a[i];
		 	count++;
		 }
		 for(int i=0;i<m;i++)
		 {
		 	c[count]=b[i];
		 	count++;
		 }

		 
		 for(int i=0;i<c.length;i++)
		 {
		 	System.out.println(c[i]);
		 }
		
		int temp2=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		System.out.println("The combined array values after ascending order");
		for(int i=0;i<c.length;i++)
		 {
		 	System.out.println(c[i]);
		 }
	
	}
}