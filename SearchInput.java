import java.util.*;
public class SearchInput {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
        }
        int m;
        boolean flag=false;
        System.out.println("Enter the element to be searched");
        m=s.nextInt();
        for(int i=0;i<n;i++){ //for printing array
        	if(arr[i]==m)
        	{
        		flag=true;
        		break;
        	}
            
        }
				if(flag)
				System.out.println("Element is present");
        	 else
        		System.out.println("Element is not present");

    }

}