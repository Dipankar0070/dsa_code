package Array;
import java.util.*;
public class Swap_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		     int [] arr= {1,2,3,4,5};
		    // int k=0;
	//	Swap(arr,k,1);
		 Swap(arr,0,1);
		System.out.println(arr[0]+ " " +arr[1]);
		//System.out.println(k);

		
	}

	public static void Swap(int [] arr, int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	//	a=99;
	}

}
