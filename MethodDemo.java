class MethodDemo
{
 
static void add() //method definition
{
	int a=5;
	int b=7;
	System.out.println(a+b);
	
}
void sub() //method definition
{
	int a=5;
	int b=7;
	System.out.println(a-b);
}
public static void main(String args[])
{
	MethodDemo md=new MethodDemo();
	add();
	md.sub();
	MethodDemo1 md1=new MethodDemo1();
	md1.sumofN();
}

}

