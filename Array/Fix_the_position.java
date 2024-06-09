package Array;
import java.util.*;
public class Fix_the_position {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,2,3,8,1,4};
		int si=0;
		int ei=arr.length-1;
		
		fixPosition(arr,si,ei);
	}
	public static void fixPosition(int[] arr,int si,int ei) {
		int item=arr[ei];
		int idx=si;
		for(int i=0;i<ei;i++) {
			if(arr[i]<=item) {
				int temp=arr[idx];
				arr[idx]=arr[i];
				arr[i]=temp;
				
				idx++;
			}
			
		}
		int temp=arr[ei];
		arr[ei]=arr[idx];
		arr[idx]=temp;
		 
		for(int i=0;i<=ei;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
