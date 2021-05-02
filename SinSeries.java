import java.util.*;
public class SinSeries {
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int n,k=-1,f=1,i,ch,t=0;
		double p,s=0,x,rad,r=0;
		
			x=sc.nextDouble();
			n=sc.nextInt();
			
			rad=3.14/180*x;
			
				s=rad;
				for(i=3;i<n;i+=2)
				{
					p=Math.pow(rad,i);
					f=f*(i-1)*i;
					r=p/f;
					s=s+k*r;
					k=k*(-1);
				}
				System.out.println("Sin("+x+")="+s);
	}
}