class SumDigit1
{
	
	static int sum(int n,int q)//5271
	{
		

		if(n==0)
			return 0;
		else
			q=q*10;
		return (n%10)*q+sum(n/10,q);

	}
	public static void main(String args[])
	{
		int n=5271;
		int q=1;
		int c=sum(n,1);
		System.out.println(c);
	}
}