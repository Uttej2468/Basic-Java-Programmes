import java.util.*;
class Food
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int 
		System.out.println("1.sign in / 2.sign up");
		int i=sc.nextInt();
		switch(i)
		{
			case 1 :
			System.out.println("User name");
			char s=sc.next().charAt(0);
			System.out.println("Password");
			int n=sc.nextInt();
			break;
			case 2 :
			System.out.println("First name");
			char aa=sc.next().charAt(0);
			System.out.println("Last name");
            char ab=sc.next().charAt(0);
            System.out.println("set new password");
            int ac=sc.nextInt();
            System.out.println("confirm password");
            int ad=sc.nextInt();
            if(ac==ad)
            	System.out.println("U r account is ready");
            else
            	System.out.println("password not matching pleas try again");
         
			break;
			default:
			System.out.println("invalid responce");
		}
	    System.out.println("1.order now");
	    System.out.println("2.Offers");
	    System.out.println("3.history");
	    System.out.println("4.Recipes");


	}
}