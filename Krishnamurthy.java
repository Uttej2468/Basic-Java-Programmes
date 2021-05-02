class Krishnamurthy
{
	public static void main(String args[])
	{
		int n=230;
		int a=n;
		int sum=0;
		int fact=1,r;
		while(n>0)
		{
			r=n%10;
			System.out.println("r"+r);
			fact=1;
			int i=1;
			while(r>0)
			{
				fact=fact*r;
				r--;
			}
			System.out.println("fact"+fact);
			sum=sum+fact;
			System.out.println("sum"+sum);
			n=n/10;
		}

		if(sum==a)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}
}