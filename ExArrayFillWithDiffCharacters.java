import java.util.*;
public class ExArrayFillWithDiffCharacters{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array:");
		int n = sc.nextInt();
		if(n<2||n>10)
		{
			System.out.println("Size out of Range");
		}
		else
		{
			char A[][]=new char[n][n];
			System.out.print("Enter first character :");
			char c1=sc.next().charAt(0);
			System.out.print("Enter second character");
			char c2=sc.next().charAt(0);
			System.out.print("Enter third character");
			char c3=sc.next().charAt(0);
			for(int i=0;i<n;i++)
			{
				for (int j=0;j<n;j++) 
				{
					if(i==j||(i+j)==(n-1))
					{
						A[i][j]=c3;
					}
					else
					{
						A[i][j]=c2;
					}

				}
			}
			for(int i=0;i<n/2;i++)
			{
				for(int j=i+1;j<n-1-i;j++)
				{
					A[i][j]=c1;
					A[n-1-i][j]=c1;
				}
			}
			System.out.println("\n OUTPUT :\n");
			for (int i=0;i<n ;i++ )
			 {
				for (int j=0;j<n ;j++ )
				 {
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
		}

	}
}