class MethodOverload
{
	static void add()
	{
	System.out.println("No argument");
	}
	static void add(int a)
	{
	System.out.println("int: "+a);
	}
	static void add(int a, int b)
	{
	System.out.println("int "+a+" "+"int "+b);

	}
	static void add(double a,int b)
	{
		System.out.println("double int");
	}
	static void add(int a,char b,int c)
	{
	System.out.println("int char int");
	}
	
	public static void main(String args[])
	{
		add(10,'c',10);
	}

}
