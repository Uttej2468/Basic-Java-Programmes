class TestArea
{
	static int area(int a)
	{
		return a*a;
	}
	static int area(int a,int b)
	{
		return a*b;
	}

	static double area(double p)
	{
		return 3.14*p*p;
	}
	static double area(double a,double b)
	{
		return 0.5*a*b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int l=sc.nextInt();
		int b=sc.nextInt();
		double r=sc.nextDouble();
		double c=sc.nextDouble();
		double h=sc.nextDouble();

		System.out.println(area(a));
		System.out.println(area(l,b));
		System.out.println(area(r));
		System.out.println(area(c,h));
	}
}