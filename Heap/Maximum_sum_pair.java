package Heap;
import java.util.*;
public class Maximum_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,2,3,3,4};
sum(arr);
	}
	public static void sum(int[] arr) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.remove();
			int b=pq.remove();
			pq.add(a+b);
			sum+=a+b;
		}
		System.out.println(sum);
	}

}
