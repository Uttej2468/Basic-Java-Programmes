class RecursiveTest1
{

int sum(int n)
{
	
if(n<=50)
    {
       	 System.out.print(n+" ");
         sum(n+2); 
     }

return 0;
}

public static void main(String args[])
{
int n=0;
RecursiveTest rt=new RecursiveTest();
rt.sum(n);


}

}

