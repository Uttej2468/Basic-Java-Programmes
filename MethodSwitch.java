class MethodSwitch
{
	  void add()
	{
		System.out.println(3+4);
		sub();
	}

	static void sub()
	{
		System.out.println(3-4);
	}

	static void mul()
	{
		System.out.println(3*4);
	}

	static void div()
	{
		System.out.println(3/1.5);
	}

	public static void main(String args[])
	{
		int n=1;
		String str=args[0];
		//System.out.println(args);
		switch(n)
		{
			case 1:
					MethodSwitch ms=new MethodSwitch();
					ms.add();
					break;
			case 2:
					sub();
					break;
			case 3:
					mul();
					break;
			case 4:
					div();
					break;
			default:
			   		System.out.println("Enter valid Choice");
		}
	}
}