class TestFact
{
	public static void main(String args[])
	{
	TestFact f1=new TestFact();
	f1.fact();
	}
	
		void fact()
		{
			int n=5;
			int f=1;
			for (int i=1;i<=5;i++)
				f=f*i;
			System.out.println(f);
			//return 0;
		}
}