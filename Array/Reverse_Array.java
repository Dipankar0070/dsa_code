package Array;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int [] arr=new int[n];
		for(int a=0; a<n; a++) {
			arr[a]=sc.nextInt();
		}
		Reverse(arr);
		for(int b=0;b<n;b++) {
			System.out.print(arr[b]+" ");
		}
	}
	
	public static void Reverse(int[]a) {
		int i=0;    
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
		
	

}
