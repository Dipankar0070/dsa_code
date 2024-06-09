package Array;
import java.util.*;
public class Rotation_Alter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		k=k%n;
		Rotate(arr,n-k,n-1);
		Rotate(arr,0,n-k-1);
		Rotate(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void Rotate(int[] a,int j,int k) {
		while(j<k) {
			int temp=a[k];
			a[k]=a[j];
			a[j]=temp;
			j++;
			k--;
		}
	}

}
