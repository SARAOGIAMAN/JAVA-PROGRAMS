
public class duplicateelements {
	void duplicate(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		duplicateelements obj=new duplicateelements();
		int arr[]= {1,1,2,3,3,4,5,6,7,7};
		obj.duplicate(arr);
	}

}
