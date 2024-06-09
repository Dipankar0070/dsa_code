package Divide_and_Conquer;

import java.util.*;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 3, 4, 2 ,765,2,-1,-2,0,0,99};
		int[] ans=merge(arr, 0, arr.length - 1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

	public static int[] merge(int[] arr, int start, int end) {
		if (start == end) {
			int[] last = new int[1];
			last[0] = arr[start];
			return last;

		}
		int mid = (start + end) / 2;
		int[] last_1 = merge(arr, start, mid);
		int[] last_2 = merge(arr, mid + 1, end);
		return Merge_two_sorted_array(last_1,last_2);
	}
	public static int[] Merge_two_sorted_array(int[]last_1,int[] last_2){
		int i=0;
		int j=0;
		int[] array=new int [(last_1.length)+(last_2.length)];
		int k=0;
		
		while(i<(last_1.length) && j<(last_2.length)) {
			if(last_1[i]>=last_2[j]) {
				array[k]=last_2[j];
				j++;
				k++;
			}
			else {
				array[k]=last_1[i];
				i++;
				k++;
			}
		}
		while(i<last_1.length) {
			array[k]=last_1[i];
			k++;
			i++;
		}
		while(j<last_2.length) {
			array[k]=last_2[j];
			k++;
			j++;
		}
		return array;
	}

}



















