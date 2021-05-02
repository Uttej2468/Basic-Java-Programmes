import java.util.*;
class DectoHexa
{
public static void main(String args[])
{


System.out.println("Please enter the number you want to convert : ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int r,i=1,binno=0;

String str2=""; 
 
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(n>0)

{
        
r=n%16; 
        
str2=hex[r]+str2;
        
n=n/16;

}
System.out.println(str2);
}
}
