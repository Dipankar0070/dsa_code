package Array;
import java.util.*;
public class Selection_sort {

	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int a=0;a<n;a++) {
				arr[a]=sc.nextInt();
			}
			Selection(arr);
		}
		public static void Selection(int[] ar) {
		 for(int i=0;i<ar.length;i++) {
			 int min=i;
			 for(int j=i+1;j<ar.length;j++) {
				 if(ar[min]>ar[j]) {
					 min=j;
				 }
			 }
			 int temp=ar[i];
			 ar[i]=ar[min];
			 ar[min]=temp;	
			 
		 }
		 for(int a=0;a<ar.length;a++) {
				System.out.print(ar[a]+" ");
			}
		}

}
