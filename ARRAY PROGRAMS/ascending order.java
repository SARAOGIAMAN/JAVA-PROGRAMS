public class ascending {
	public static void main(String[] args)
	{
		int ar[]= {5,7,8,5,4,7,9};
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
