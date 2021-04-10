import java.util.*;
public class pairs_of_a_sum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]= {1,2,3,4,5,6,7,8,9};
		int x,i,j;
		System.out.println("Enter the number ");
		x=sc.nextInt();
		System.out.println("PAIRS ARE :");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				if((ar[j]+ar[i])==x)
					System.out.println(ar[j]+" "+ar[i]);
			}
		}
    }
}
