
public class maxsumcontigoussubarray {
	public static void main(String[] args) {
		int ar[]= {-2,-3,-1,-3};
		int maxsofar=Integer.MIN_VALUE,maxend=0;
		for(int i=0;i<ar.length;i++)
		{
		     maxend=maxend+ar[i];
		     if(maxsofar<maxend)
		    	 maxsofar=maxend;
		     if(maxend<0)
		    	 maxend=0;
		
		}
		System.out.println(maxsofar);
	}

}
