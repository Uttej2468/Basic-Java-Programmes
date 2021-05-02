import java.util.*;
import java.lang.*;
class Password
{
public static void main(String args[])
{
String str="false";
int i=0;
while(str=="false")
{
if(i>0)
{
System.out.println("Re enter:");
}
Scanner sc=new Scanner(System.in);
String pass,p1;
System.out.println("enter pass:");
pass=sc.next();
System.out.println("confirm pass:");
p1=sc.next();
boolean s=pass.equals(p1);
str=Boolean.toString(s);
i++;
}

}
}