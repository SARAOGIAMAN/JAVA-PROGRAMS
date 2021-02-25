
public class sortnegative {
public static void main(String[] args) {
	int ar[]= {-1,-6,6,4,-8,2,2,36,-89};
	int j=0,temp;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]<0)
		{
			if(i!=j)
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		    j++;
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
