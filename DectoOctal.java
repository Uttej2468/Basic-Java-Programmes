import java.util.*;
class DectoOctal
{
public static void main(String args[])
{


System.out.println("Please enter the number you want to convert : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt(); //125
int r,i=1,binno=0;
int a=n;
int b=n;


while(a>0)

{
        
binno=binno+(a%2)*i;
        
i=i*10;
        
a=a/2;

}

System.out.println("Dec to Binary"+binno);


//i=1;
//binno=0;

while(n>0)

{
        
binno=binno+(n%8)*i;
        
i=i*10;
        
n=n/8;

}
System.out.println("Decimal to OCtal"+binno);


i=1;
binno=0;
String str2=""; 
 
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(b>0)

{
        
r=b%16; 
        
str2=hex[r]+str2;
        
b=b/16;

}
System.out.println("Decimal to Hexa"+str2);

}
}
