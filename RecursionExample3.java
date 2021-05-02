class RecursionExample3
{  
	void printFun(int test) 
	{ 
    if (test < 1) 
    {
    return;
    }
    else
    { 
        System.out.println("before function call "+test); 
        printFun(test-1);    // statement 2 
        System.out.println("After function call "+test); 
      
    } 
} 
public static void main(String[] args)
	 	{   
    	int test = 3; 
        RecursionExample3 re=new RecursionExample3();
    	re.printFun(test); 
    	}  
}  