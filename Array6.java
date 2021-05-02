import java.util.*;
class Array6
{
	public static void main(String[] args)
	{
		String sname[]=new String[2];
		String sreg[]=new String[2];
		String branch[]=new String[2];
		int mark[]=new int[5];
		int total[]=new int[2];
		double avg[]=new double[2];
		int sum=0;

		System.out.println("Enter the Student information");
		Scanner scan=new Scanner(System.in);

		for(int i=0;i<2;i++)
		{
			System.out.println("Student Name");
			sname[i]=scan.next();
			System.out.println("Student Reg_no");
			sreg[i]=scan.next();
			System.out.println("Student branch");
			branch[i]=scan.next();
			System.out.println("Enter the Student 5 marks");
			for(int j=0;j<5;j++)
			{
				mark[j]=scan.nextInt();
				sum=sum+mark[j];
			}
			total[i]=sum;
			avg[i]=(double)sum/mark.length;
		}

		for(int k=0;k<2;k++)
		{
			System.out.println("Student Name :"+sname[k]);
			System.out.println("Student Reg_No :"+sreg[k]);
			System.out.println("Student branch :"+branch[k]);
			System.out.println("Student total :"+total[k]);
			System.out.println("Student Avg :"+avg[k]);
			System.out.println("************");
		}
	}
}