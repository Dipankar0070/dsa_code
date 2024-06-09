package Array;
import java.util.*;
public class Merge_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,5,7,11};
		int[] arr2= {1,2,3,7,12,13,14,15};
		
		fun(arr1,arr2);
		
		}
	
	public static void fun(int[] arr1,int[]arr2) {
		
		int a1=arr1.length;
		int a2=arr2.length;
		int i=0;
		int j=0;
		
		int[] ans_arr=new int[a1+a2];
		int k=0;
		
		while(i<a1 && j<a2) {
			if(arr1[i] >= arr2[j]) {
				ans_arr[k]=arr2[j];
				j++;	
				k++;
			}
			else {
				ans_arr[k]=arr1[i];
				i++;
				k++;
			}
			
		}
		while(i<a1) {
			ans_arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<a2) {
			ans_arr[k]=arr2[j];
			j++;
			k++;
		}
		for(int p=0;p<a1+a2;p++) {
			System.out.print(ans_arr[p]+" ");
		}
	}
	
	}


