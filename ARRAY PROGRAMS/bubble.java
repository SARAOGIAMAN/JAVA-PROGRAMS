public class bubble {
	int i,l,j,temp;
	void sort(int ar[])
	{
		l=ar.length;
		for(int i=0;i<l;i++)
		{
			for(j=0;j<(l-i-1);j++)
			{
				if(ar[j]>ar[j+1])
				{
				 temp=ar[j+1];
				ar[j+1]=ar[j];
				ar[j]=temp;
			}
		}
	}
	}
	void print(int ar[])
	{
		for(i=0;i<l;i++)
		{
			System.out.print(" "+ar[i]);
		}
		System.out.println();
	}
public static void main(String args[])
{
	bubble obj=new bubble();
	int ar[]= {3,2,1,5,4};
	obj.sort(ar);
	obj.print(ar);
}
}