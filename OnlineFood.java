import java.util.*;
class OnlineFood
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
        System.out.println("  **$$ Welcome to Online Food ordering App $$** ");
		System.out.println("1.sign in / 2.sign up");
		int i=in.nextInt();
		switch(i)
		{
			case 1 :
			System.out.println("User name");
			char s=in.next().charAt(0);
			System.out.println("Password");
			char n=in.next().charAt(0);
			break;
			case 2 :
			System.out.println("First name");
			char aa=in.next().charAt(0);
			System.out.println("Last name");
            char ab=in.next().charAt(0);
			String str="false";
            int z=0;
            while(str=="false")
            {
            if(z>0)
            {
            System.out.println("Re :");
            }
            Scanner sc=new Scanner(System.in);
            String pass,p1;
            System.out.println("enter password:");
            pass=sc.next();
            System.out.println("confirm password:");
            p1=sc.next();
            boolean tt=pass.equals(p1);
            str=Boolean.toString(tt);
            z++;
        
        }
         
			break;
			default:
			System.out.println("invalid responce");
		}
	    System.out.println("1.order now");
	    System.out.println("2.Previous Orders");
	    System.out.println("3.Feed Back");
	    int x=in.nextInt();
	    switch(x){
        case 1 :
        System.out.println("Hotels are:");
        System.out.println();
		System.out.println("1.The Marriot  ");
		System.out.println("2.Gate way   ");
		System.out.println("3.Tatva  ");
		System.out.println("4.Pai Viceroy  ");
		System.out.println("5.Novotel  ");
		int cost=0,bill=0,sn,n,st,hn;
		Long ph;
		int pn;
		char ch='a',area;
		int j=in.nextInt();
		int price[]={100,240,250,300,409,550,600,999,555,234,142,342,43,114,554,56,565,567,754,536,444,333,666,777,888,999,434,454,449,452};
		switch(j)
		{
			case 1 :
			System.out.println("U selected The Marriot");
			System.out.println();
			
		while(ch!='n')
		{
		System.out.println(" 1.Indian Cheese Pizza	11.Fish Burger			21.Coffee/Tea");
		System.out.println(" 2.Italian Red Delight Pizza12.Chrispy Veg Burger		22.Fried Chicken");
		System.out.println(" 3.Panner Cheese Pizza  	13.Veg Noodles			23.Cold Drinks");
		System.out.println(" 4.Chilly Hot Chrispy pizza 14.Chicken Noodles		24.Spicy Chily Dosa");
		System.out.println(" 5.Veg Burger		15.Chicken Biriyani		25.Masala Drizzled Maggie");
		System.out.println(" 6.Chicken Pizza		16.Veg-Biriyani			26.Maggie with Mayo");
		System.out.println(" 7.Fried chicken Burger	17.Chilly Chicken		27.Chinese Noodles");
		System.out.println(" 8.Chicken Burger		18.Grilled chicken(FULL/HALF)	28.Italian Spicy Noodles");
		System.out.println(" 9.Chicken Wings		19.Tanthoori Chicken(FULL/HALF)	29.German Sweet Noodles");
		System.out.println("10.Chicken hot&spicy	20.Chicken BBQ(FULL/HALF)	30.Indian Masala Spicy Noodles");
		System.out.println("Enter the serial no of dish you want : ");
		sn=in.nextInt();
		n=sn-1;
		System.out.println("Enter the count of the dish you want : ");
		int q=in.nextInt();
		cost=price[n]*q;
		bill=bill+cost;
		System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
		ch=in.next().charAt(0);
		}
		System.out.println("Please enter your phone number : ");
		ph=in.nextLong();
		System.out.println("Enter area name : ");
		area=in.next().charAt(0);
		System.out.println("Enter street number : ");
		st=in.nextInt();
		System.out.println("Enter house number : ");
		hn=in.nextInt();
		System.out.println("Enter pincode : ");
		pn=in.nextInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println();
		System.out.println("Your order is being placed");
		System.out.println();
		System.out.println("Your total cost of order is : "+bill);
		System.out.println();
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println();
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println();
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
		break;
		
		case 2 :
		System.out.println("U selected Gate way");
		System.out.println();
		while(ch!='n')
		{
		System.out.println(" 1.Indian Cheese Pizza	11.Fish Burger			21.Coffee/Tea");
		System.out.println(" 2.Italian Red Delight Pizza12.Chrispy Veg Burger		22.Fried Chicken");
		System.out.println(" 3.Panner Cheese Pizza  	13.Veg Noodles			23.Cold Drinks");
		System.out.println(" 4.Chilly Hot Chrispy pizza 14.Chicken Noodles		24.Spicy Chily Dosa");
		System.out.println(" 5.Veg Burger		15.Chicken Biriyani		25.Masala Drizzled Maggie");
		System.out.println(" 6.Chicken Pizza		16.Veg-Biriyani			26.Maggie with Mayo");
		System.out.println(" 7.Fried chicken Burger	17.Chilly Chicken		27.Chinese Noodles");
		System.out.println(" 8.Chicken Burger		18.Grilled chicken(FULL/HALF)	28.Italian Spicy Noodles");
		System.out.println(" 9.Chicken Wings		19.Tanthoori Chicken(FULL/HALF)	29.German Sweet Noodles");
		System.out.println("10.Chicken hot&spicy	20.Chicken BBQ(FULL/HALF)	30.Indian Masala Spicy Noodles");
		System.out.println("Enter the serial no of dish you want : ");
		sn=in.nextInt();
		n=sn-1;
		System.out.println("Enter the count of the dish you want : ");
		int q=in.nextInt();
		cost=price[n]*q;
		bill=bill+cost;
		System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
		ch=in.next().charAt(0);
		}
		System.out.println("Please enter your phone number : ");
		ph=in.nextLong();
		System.out.println("Enter area name : ");
		area=in.next().charAt(0);
		System.out.println("Enter street number : ");
		st=in.nextInt();
		System.out.println("Enter house number : ");
		hn=in.nextInt();
		System.out.println("Enter pincode : ");
		pn=in.nextInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println();
		System.out.println("Your order is being placed");
		System.out.println();
		System.out.println("Your total cost of order is : "+bill);
		System.out.println();
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println();
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println();
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
        break;
        case 3 :
        System.out.println("U selected Tatva");
        System.out.println();
        System.out.println();
		while(ch!='n')
		{
		System.out.println(" 1.Indian Cheese Pizza	11.Fish Burger			21.Coffee/Tea");
		System.out.println(" 2.Italian Red Delight Pizza12.Chrispy Veg Burger		22.Fried Chicken");
		System.out.println(" 3.Panner Cheese Pizza  	13.Veg Noodles			23.Cold Drinks");
		System.out.println(" 4.Chilly Hot Chrispy pizza 14.Chicken Noodles		24.Spicy Chily Dosa");
		System.out.println(" 5.Veg Burger		15.Chicken Biriyani		25.Masala Drizzled Maggie");
		System.out.println(" 6.Chicken Pizza		16.Veg-Biriyani			26.Maggie with Mayo");
		System.out.println(" 7.Fried chicken Burger	17.Chilly Chicken		27.Chinese Noodles");
		System.out.println(" 8.Chicken Burger		18.Grilled chicken(FULL/HALF)	28.Italian Spicy Noodles");
		System.out.println(" 9.Chicken Wings		19.Tanthoori Chicken(FULL/HALF)	29.German Sweet Noodles");
		System.out.println("10.Chicken hot&spicy	20.Chicken BBQ(FULL/HALF)	30.Indian Masala Spicy Noodles");
		System.out.println("Enter the serial no of dish you want : ");
		sn=in.nextInt();
		n=sn-1;
		System.out.println("Enter the count of the dish you want : ");
		int q=in.nextInt();
		cost=price[n]*q;
		bill=bill+cost;
		System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
		ch=in.next().charAt(0);
		}
		System.out.println("Please enter your phone number : ");
		ph=in.nextLong();
		System.out.println("Enter area name : ");
		area=in.next().charAt(0);
		System.out.println("Enter street number : ");
		st=in.nextInt();
		System.out.println("Enter house number : ");
		hn=in.nextInt();
		System.out.println("Enter pincode : ");
		pn=in.nextInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println();
		System.out.println("Your order is being placed");
		System.out.println();
		System.out.println("Your total cost of order is : "+bill);
		System.out.println();
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println();
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println();
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
		break;
		case 4 :
		System.out.println("U selected Pai Viceroy Hotel");
		System.out.println();
		while(ch!='n')
		{
		System.out.println(" 1.Indian Cheese Pizza	11.Fish Burger			21.Coffee/Tea");
		System.out.println(" 2.Italian Red Delight Pizza12.Chrispy Veg Burger		22.Fried Chicken");
		System.out.println(" 3.Panner Cheese Pizza  	13.Veg Noodles			23.Cold Drinks");
		System.out.println(" 4.Chilly Hot Chrispy pizza 14.Chicken Noodles		24.Spicy Chily Dosa");
		System.out.println(" 5.Veg Burger		15.Chicken Biriyani		25.Masala Drizzled Maggie");
		System.out.println(" 6.Chicken Pizza		16.Veg-Biriyani			26.Maggie with Mayo");
		System.out.println(" 7.Fried chicken Burger	17.Chilly Chicken		27.Chinese Noodles");
		System.out.println(" 8.Chicken Burger		18.Grilled chicken(FULL/HALF)	28.Italian Spicy Noodles");
		System.out.println(" 9.Chicken Wings		19.Tanthoori Chicken(FULL/HALF)	29.German Sweet Noodles");
		System.out.println("10.Chicken hot&spicy	20.Chicken BBQ(FULL/HALF)	30.Indian Masala Spicy Noodles");
		System.out.println("Enter the serial no of dish you want : ");
		sn=in.nextInt();
		n=sn-1;
		System.out.println("Enter the count of the dish you want : ");
		int q=in.nextInt();
		cost=price[n]*q;
		bill=bill+cost;
		System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
		ch=in.next().charAt(0);
		}
		System.out.println("Please enter your phone number : ");
		ph=in.nextLong();
		System.out.println("Enter area name : ");
		area=in.next().charAt(0);
		System.out.println("Enter street number : ");
		st=in.nextInt();
		System.out.println("Enter house number : ");
		hn=in.nextInt();
		System.out.println("Enter pincode : ");
		pn=in.nextInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println();
		System.out.println("Your order is being placed");
		System.out.println();
		System.out.println("Your total cost of order is : "+bill);
		System.out.println();
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println();
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println();
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
        break;
        case 5 :
        System.out.println(" u Selected Novotel Hotel");
         System.out.println();
		while(ch!='n')
		{
		System.out.println(" 1.Indian Cheese Pizza	11.Fish Burger			21.Coffee/Tea");
		System.out.println(" 2.Italian Red Delight Pizza12.Chrispy Veg Burger		22.Fried Chicken");
		System.out.println(" 3.Panner Cheese Pizza  	13.Veg Noodles			23.Cold Drinks");
		System.out.println(" 4.Chilly Hot Chrispy pizza 14.Chicken Noodles		24.Spicy Chily Dosa");
		System.out.println(" 5.Veg Burger		15.Chicken Biriyani		25.Masala Drizzled Maggie");
		System.out.println(" 6.Chicken Pizza		16.Veg-Biriyani			26.Maggie with Mayo");
		System.out.println(" 7.Fried chicken Burger	17.Chilly Chicken		27.Chinese Noodles");
		System.out.println(" 8.Chicken Burger		18.Grilled chicken(FULL/HALF)	28.Italian Spicy Noodles");
		System.out.println(" 9.Chicken Wings		19.Tanthoori Chicken(FULL/HALF)	29.German Sweet Noodles");
		System.out.println("10.Chicken hot&spicy	20.Chicken BBQ(FULL/HALF)	30.Indian Masala Spicy Noodles");
		System.out.println("Enter the serial no of dish you want : ");
		sn=in.nextInt();
		n=sn-1;
		System.out.println("Enter the count of the dish you want : ");
		int q=in.nextInt();
		cost=price[n]*q;
		bill=bill+cost;
		System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
		ch=in.next().charAt(0);
		}
		System.out.println("Please enter your phone number : ");
		ph=in.nextLong();
		System.out.println("Enter area name : ");
		area=in.next().charAt(0);
		System.out.println("Enter street number : ");
		st=in.nextInt();
		System.out.println("Enter house number : ");
		hn=in.nextInt();
		System.out.println("Enter pincode : ");
		pn=in.nextInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println();
		System.out.println("Your order is being placed");
		System.out.println();
		System.out.println("Your total cost of order is : "+bill);
		System.out.println();
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println();
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println();
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
		break;
	default:

	System.out.println("invalid");
	}
		break;
    case 2 :
    System.out.println("Previous Orders");
    System.out.println();
    System.out.print(" NO ORDERS YET ");
    System.out.println("please order now");
    break;
    case 3 :
    System.out.println("Give your valuable suggetion");
    char ae=in.next().charAt(0);
    System.out.println();
    System.out.println("Thanks for giving your valuable suggestions");
    break;
    default:
	System.out.println("invalid please select option 1 / 2 / 3 ");
        
      	}
	}
}