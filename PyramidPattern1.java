import java.util.*;
class PyramidPattern1
{
public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

        

		/*for (int i=n; i>=1; i--) 
        { 
            
             for(int j=n-i; j>0  ;j--)
            {
                System.out.print(" ");
            }
              
              for (int k=i; k>0; k-- ) 
            {                 
                System.out.print("* "); 
            }            
              
            System.out.println(); 
        } */

        for (int i=1; i<=n; i++) 
        { 
            
             for(int j=1; j<=i  ;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

       /* for (int i=0; i<n; i++) 
        { 
            
             for(int j=0; j<=i-1  ;j++)
            {
                System.out.print(" ");
            }
              
              for (int k=n; k>i; k-- ) 
            {                 
                System.out.print("* "); 
            }            
              
           System.out.println(); 
        } */
}
}