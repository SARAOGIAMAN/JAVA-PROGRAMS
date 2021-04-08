    import java.util.*;
public class kmaxminar {
	  public static void main(String[] args)
	    {
		 Scanner sc=new Scanner(System.in);
		 int ar[]= {1,5,6,9,7,8,2};
		 int n=ar.length;
		int temp,k;
		//BUBBLE SORT
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
			if(ar[j]>ar[j+1])
			{
				temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
		}
		//PRINTING THE ELEMENTS
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the kth element ");
		k=sc.nextInt();
		System.out.println("kth max is "+ar[n-k]);
		System.out.println("kth min is "+ar[k-1]);
    }
}

    
