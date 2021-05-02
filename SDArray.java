import java.util.*;
class SDArray
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
		double sum=0;
		double sd=0;
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array values");
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
		double avg=sum/a.length;

		for(int i=0;i<size;i++)
		{
		
		sd=sd+ Math.pow(a[i] - avg, 2);
		}
		sd=Math.sqrt(sd/size);
		System.out.println("The sum is:"+sum);
		System.out.printf("The Average is %.2f\n",avg);
		System.out.printf("The Standard Deviation is %.2f",sd);
	}
}