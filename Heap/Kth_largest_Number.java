package Heap;
import java.util.*;
public class Kth_largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,7,-2,11,8,3,15,2,1,17};
		int k=3;
		System.out.println(kth(arr,k));
	}
	public static int kth(int[] arr,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			//min=pq.peek()
			if(arr[i]>pq.peek()) {
				pq.remove(pq.peek());
				pq.add(arr[i]);
				
			}
		}
		return pq.peek();
	}

}
