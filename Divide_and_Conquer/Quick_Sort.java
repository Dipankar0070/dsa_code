package Divide_and_Conquer;

import java.util.*;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,2,11,4};
		Quick(arr,0,arr.length-1);
		for(int z=0;z<arr.length;z++) {
			System.out.println(arr[z]+" ");
		}
	}
	public static void Quick(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int p=Fix_The_Position(arr , start, end);
		Quick(arr,start,p-1);
		Quick(arr,p+1, end);
	}
	public static int Fix_The_Position(int[] array , int start, int end) {
		
		int p=start;
		int item=array[end];
		for(int i=start;i<end;i++) {
			if(array[i]<=item) {
				int temp=array[i];
				array[i]=array[p];
				array[p]=temp;
				p++;
			}
		}
		int temp=array[end];
		array[end]=array[p];
		array[p]=temp;
		
		return p;
	}
}


