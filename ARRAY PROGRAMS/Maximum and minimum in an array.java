
public class maxminarr {

	public static void main(String[] args) {
		int ar[]= {5,2,2,2,2,2,3,6,4,78};
		int max=ar[0];
		int min=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("maximum "+max);
		System.out.println("minimum "+min);
			
		}

}
