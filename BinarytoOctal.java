import java.lang.*;
import java.util.*;
class BinarytoOctal
{
public static void main(String args[])
{
System.out.println("Please enter the Binary Number : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int r,i=0,sum=0;
while(n>0)
{    
r=n%10;        
sum=sum+r*(int)(Math.pow(2,i));        
n=n/10;
i++;
}
System.out.println("Decimal Number"+sum);
int octno=0;
i=1;
while(sum>0)
{
octno=octno+(sum%8)*i;    
i=i*10;        
sum=sum/8;
}
System.out.printf("Octal Number=%d",octno);

}
}
