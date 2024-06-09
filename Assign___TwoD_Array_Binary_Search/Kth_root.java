package Assign___TwoD_Array_Binary_Search;
import java.util.*;
public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			long n=sc.nextLong();
			long k=sc.nextLong();
			System.out.println(ques(n,k));
			//ques(n,k);
			t--;
		}
	}
	public static long ques(long n,long k) {
	long low=0;
	long high=n;
	long ans=0;
	while(low<=high) {
		long mid=(low+high)/2;
		long pwr=(long)Math.pow(mid,k);
		if(pwr>n) {
			high=mid-1;
		}
		if(pwr==n) {
			ans=mid;
			break;
		}
		if(pwr<n) {
			ans=mid;
			low=mid+1;
		}
		
	}
	return ans;
	}

}
