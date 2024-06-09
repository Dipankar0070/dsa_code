package Sliding_Windows;
import java.util.*;
public class K_size_max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,1,3,4,5,1,3,7,8,4,1};
		int k=3;
		int sum=0;
		int max=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		max=sum;
		int idx=0;
		for(int j=k;j<arr.length;j++) {
			sum=sum+arr[j]-idx; // idx ke jagah=arr[j-k];
			idx++;
			max=Math.max(max,sum);
		}
		System.out.println(max);
	}

}
