class RecursionExample2 
{  
    static int c=0;
    static void p(int n)//n=5
	{  
    	
        c++;
    	if(c<=n)
    	{
    	System.out.print(c+" ");
    	p(n);  
    	} 
    } 
      
    public static void main(String[] args)
	 	{   
    	p(5);  
    	}  
}  