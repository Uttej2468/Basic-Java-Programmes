import java.util.*;
class RecursiveTest
{

static void sum(int n)
{
	
if(n<=50)
    {
       	 System.out.print((n+1)+" ");
         sum(n+2);
     }


}

public static void main(String args[])
{
int n=0;

sum(n);


}

}

