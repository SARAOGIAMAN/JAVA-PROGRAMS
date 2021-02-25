
public class sort012 {
	public static void main(String[] args) {
		int c0=0,c1=0,c2=0,i,j;
		int ar[]= {0,1,2,0,0,0,2,1,1,0,1,1,1,0};
		for(i=0;i<ar.length;i++)
		{
			switch(ar[i])
			{
				case 0:
					c0++;
					break;
				case 1:
					c1++;
					break;
				case 2:
					c2++;
					break;
			}
		}
		j=0;
		while(c0>0)
		{
			ar[j++]=0;
			c0--;
		}
		while(c1>0)
		{
			ar[j++]=1;
			c1--;
		}
		while(c2>0)
		{
			ar[j++]=2;
			c2--;
		}
		System.out.println();
		for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}
	}

}
