//import java.util.Arrays;   
public class cylindricalrotate
{ 
      public static void main(String[] args)  
    { 
    	  int arr[] ={1, 2, 3, 4, 5}; 
    	  int x = arr[arr.length-1], i; 
          for (i = arr.length-1; i > 0; i--) 
             arr[i] = arr[i-1]; 
          arr[0] = x; 
          for(i=0;i<arr.length;i++)
             System.out.print(arr[i]+" ");
    } 
    
} 
