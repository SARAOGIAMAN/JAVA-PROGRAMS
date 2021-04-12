package array;
public class sub_2_matrix  
{  
    public static void main(String[] args) {  
        int rows,cols;  
          int a[][]={  
                          {4,5,6},  
                          {3,4,1},  
                          {1,2,3}  
                       };  
          int b[][]={  
                          {2,0,3},  
                         {2,3,1},  
                         {1,1,1}  
                     };  
          rows=a.length;  
        cols=a[0].length;  
        int sub[][]=new int[rows][cols];  
        for(int i=0;i<rows;i++){  
            for(int j=0;j<cols;j++){  
                sub[i][j]=a[i][j]-b[i][j];  
            }  
        }  
        System.out.println("Addition of two matrices: ");  
        for(int i=0;i<rows;i++){  
            for(int j=0;j<cols;j++){  
               System.out.print(sub[i][j]+" ");  
            }  
            System.out.println();  
        }  
    }  
}    
