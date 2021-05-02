class SumDigit
{
	int sumofDigit(int n,char ch)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(ch);
		System.out.println(sum);
		return 0;
	}
	public static void main(String args[])
	{
		SumDigit sd=new SumDigit();
		int c=sd.sumofDigit(234,'s');
		System.out.println(c);
	}
}
