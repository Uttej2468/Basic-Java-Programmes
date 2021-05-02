import java.util.*; 
class Order
{
	public static void main(String [] args)
	{
		int cost=0,bill=0,sn,n,ph,st,hn,pn;
		char ch=a,area;
		Scanner in = new Scanner(System.in);
		int price[]={100,240,250,300,409,550,600,999,555,234,142,342,43,114,554,56,565,567,754,536,444,333,666,777,888,999,434,454,449,452};
		while(ch!=n)
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
			sn=in.newInt();
			n=sn-1;
			System.out.println("Enter the count of the dish you want : ");
			q=in.newInt();
			cost=price[n]*q;
			bill=bill+cost;
			System.out.println("Do you want to order anything else, if Yes enter y and if No enter n : ");
			ch=in.newchar();
		} 
		System.out.println("Please enter your phone number : ");
		ph=in.newInt();
		System.out.println("Enter area name : ");
		area=in.newchar();		
		System.out.println("Enter street number : ");
		st=in.newInt();
		System.out.println("Enter house number : ");
		hn=in.newInt();
		System.out.println("Enter pincode : ");
		pn=in.newInt();
		System.out.println("Thank you for ordering!!!");
		System.out.println("Your order is being placed");
		System.out.println("Your total cost of order is : "+bill);
		System.out.println("Please pay the bill to the delivery boy");
		System.out.println("Your food will arrive at your footsteps by 30mins");
		System.out.println("For more details of the cuurent status of your order call toll free no +1800 670 460");
		
	}
}