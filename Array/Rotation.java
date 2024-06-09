//Reversal algorithm or Rotation k times.


package Array;
import java.util.*;
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int [n];
		for(int a=0;a<n;a++) {
			arr[a]=sc.nextInt();
		}
		Rotate(arr,k);
		for(int a=0;a<n;a++) {
			System.out.print(arr[a]+" ");
		}
	}
	public static void Rotate(int[]arr, int k) {
		int i=1;
		k=k%arr.length;
		while(i<=k) {
			int last_ele=arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--) {
				arr[j+1]=arr[j];
		
			}
			arr[0]=last_ele;
			i++;
		}
	}

}
