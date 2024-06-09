package Assign___Array;
import java.util.*;
public class sorting_in_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt(); 
	         int[] arr=new int[n];
	           for (int i = 0; i < n; i++) {
	            arr[i]=sc.nextInt();
             }
	            sortColors(arr); 
	          
	    }
	    public static void sortColors(int[] nums) {
	        // Write your code here
	            int count0=0;
	            int count1=0;
              int count2=0;
			 for(int i=0;i<nums.length;i++){
	             if(nums[i]==0){
	                 count0++;
	             }
	             else if(nums[i]==1){
	                 count1++;
	             }
               else if(nums[i]==2){
	                 count2++;
	             }

	         }
	         
	         for(int j=0;j<count0;j++){
	             nums[j]=0;
	         }
	         for(int k=count0;k<=count1;k++){
	             nums[k]=1;
	         }
	         for(int j=count1+1;j<nums.length;j++){
	             nums[j]=2;
	         }
	          for (int i = 0; i < nums.length; i++){
	              System.out.println(nums[i]);
	           }
	        }
	    
	}



