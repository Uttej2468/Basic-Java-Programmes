import java.util.Scanner;

class BinaryToHex
{
    public static void main(String args[])
 {
 System.out.println("Please enter the number you want to convert : ");
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
System.out.println(sum);
n=sum;
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