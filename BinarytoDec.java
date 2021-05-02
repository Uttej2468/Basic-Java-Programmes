import java.lang.*;
import java.util.*;
class BinarytoDec
{
public static void main(String args[])
{
System.out.println("Please enter the number you want to convert : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int r,i=0,sum=0;
System.out.println((Math.pow(2,6)));
while(n>0)
{       
r=n%10;       
sum=sum+r*(int)(Math.pow(2,i));
n=n/10;
i++;
}
System.out.println(sum);
}
}
