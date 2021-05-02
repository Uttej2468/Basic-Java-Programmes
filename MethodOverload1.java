import java.util.*;
class MethodOverload1
{
	static void display(int a, char ch)
	{
		System.out.println(a+" "+ch);
	}

	static void display(double a, double b)
	{
		System.out.println(a+" "+b);
	}

	static void display(int a, double ch)
	{
		System.out.println(a+" "+ch);
	}

	static void display(int a)
	{
		System.out.println(a);
	}
	static void display()
	{
		System.out.println("No parameter");
	}
	public static void main(String args[])
	{
			display();
			display(10);
			display(10,'A');
			display(10.0,30.0);
			display(20,20);
	}
}