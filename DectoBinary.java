import java.util.*;
class DectoBinary
{
public static void main(String args[])
{


System.out.println("Please enter the number you want to convert : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int r,i=1,binno=0;

while(n>0)
{      
binno=binno+(n%2)*i;   
i=i*10;
n=n/2;
}

System.out.println(binno);
}
}
