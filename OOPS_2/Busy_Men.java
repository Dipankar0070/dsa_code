package OOPS_2;

import java.util.*;

public class Busy_Men {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			time[] arr=new time[n];
			for(int i=0;i<arr.length;i++) {
				int start=sc.nextInt();
				int end=sc.nextInt();
				arr[i]=new time(start,end);
			}
			Arrays.sort(arr, new Comparator<time>() {

				@Override
				public int compare(time o1, time o2) {
					// TODO Auto-generated method stub
					return o1.end-o2.end;
				}
				
			});
			int count=1;
			int end=arr[0].end;
			for(int i=1;i<arr.length;i++) {
				if(end<=arr[i].start) {
					count++;
					end=arr[i].end;
				}
			}
			System.out.println(count);
			
		}
	}
	public static class time{
		int start;
		int end;
		public time(int start,int end) {
			this.start=start;
			this.end=end;
		}
	}
}