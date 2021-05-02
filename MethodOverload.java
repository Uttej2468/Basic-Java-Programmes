class MethodOverload
{
	
	
	static void add(char b)
	{
		System.out.println("char");
	}
	static void add(int a)
	{
		System.out.println("int");
	}

	public static void main(String args[])
	{
		add('C');
	}

}
