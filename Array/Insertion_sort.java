package Array;
import java.util.*;
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int a=0;a<n;a++) {
			arr[a]=sc.nextInt();
		}
		Insertion(arr);
	}
	public static void Insertion(int []ar) {
		 for(int i=1;i<ar.length;i++) {
			 int picked=ar[i];
			 int j=i-1;
			 
			 while(j>-1 && picked<ar[j]) {
				 ar[j+1]=ar[j];
				 j--;
			 }		
			 ar[j+1]=picked;
		 }
		 for(int a=0;a<ar.length;a++) {
				System.out.print(ar[a]+" ");
			}
	}
}
