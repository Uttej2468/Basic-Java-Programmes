import java.util.*;
class FirstSecondLarge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int i,j,big1=1,big2=0;

        for(i=0;i<m;i++)
        for(j=0;j<n;++j)
            a[i][j]=sc.nextInt();


        for(i=0;i<m;++i)
        for(j=0;j<n;++j)
            {
            if(a[i][j]>big1)
                big1=a[i][j];
            }
        

        for(i=0;i<m;++i)
        for(j=0;j<n;++j)
        {
            if(a[i][j]>big2&&a[i][j]<big1)
                big2=a[i][j];
        }
        System.out.println("First Largest Number: "+big1);
        System.out.println("Second Largest Number: "+big2);
}
} 