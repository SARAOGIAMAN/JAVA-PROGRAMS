
public class revarr 
{
	 void swap(int ar[],int start,int end)
	{
		 int temp;
		 while(start<end)
		 {
			 temp=ar[start];
			 ar[start]=ar[end];
			 ar[end]=temp;
			 start++;
			 end--;
	}
	}
	 void printarray(int ar[])
	 {
		 int l=ar.length;
		 for(int i=0;i<l;i++)
		 {
			 System.out.print(ar[i]+" ");
		 }
	 }
	 public static void main(String[] args)
	 {
		 revarr obj=new revarr();
		 {
		 int arr[]= {1,2,3,4,5};
		 obj.swap(arr,0,4);
		 obj.printarray(arr);
	 }
}
}