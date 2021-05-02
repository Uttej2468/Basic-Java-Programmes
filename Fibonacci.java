    import java.util.*;
    class Fibonacci
    {  
    public static void main(String args[])  
    {    
     Scanner sc=new Scanner(System.in);
     int n1=0,n2=1,n3,i=2,n;   
     n=sc.nextInt(); 
     System.out.print(n1+" "+n2);
     
     while(i<n)
      {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3; 
      i++;   
      }    
      
    }
  }  