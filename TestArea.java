class TestArea
{
	static int area(int a)
	{
		return a*a;
	}
	 int area(int a,int b)
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
		TestArea ta=new TestArea();
		int a=ta.area(10);
		System.out.println(a);
	}
}