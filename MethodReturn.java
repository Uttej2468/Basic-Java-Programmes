import java.util.*;
class MethodReturn
{
double  CalcSal(char ch)
{
Scanner sc=new Scanner(System.in);

int m1=sc.nextInt();
double m2=sc.nextDouble();

double d;
System.out.println((int)ch);
return d=m1*m2;
}

public static void main(String args[])
{
MethodReturn md=new MethodReturn();
double c=md.CalcSal('B');
System.out.println("c="+c);
}

}
