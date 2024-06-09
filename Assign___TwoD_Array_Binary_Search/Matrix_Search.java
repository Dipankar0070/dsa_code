package Assign___TwoD_Array_Binary_Search;
import java.util.*;
public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int[][] arr=new int[m][n];
	        for (int i=0; i<m; i++){
	               for(int j=0; j<n; j++){
	                     arr[i][j]=sc.nextInt();
	                }
	         }
	         int k = sc.nextInt();
	          System.out.print(searchMatrix(arr, k));
	    }
	    public static int searchMatrix(int[][] matrix, int target) {
	        // Write your code here
	    	for(int i=0;i<matrix.length;i++) {
	    		 for(int j=0;j<matrix.length;j++) {
	    			 if(target==matrix[i][j]) {
	    				 return 1;
	    				
	    			 }
	 	    		 }
	    	}
	    	return 0 ;
	    }
	}


