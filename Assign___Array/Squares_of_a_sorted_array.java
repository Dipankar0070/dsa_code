package Assign___Array;
import java.util.*;
public class Squares_of_a_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
		for(int a=0; a<n; a++) {
			arr[a]=sc.nextInt();
		}
		 square(arr);
        sort(arr);
       
    }
    public static void sort(int[] ar){
        for(int i=0;i<ar.length;i++){
            int min=i;
        for(int j=i+1;j<ar.length;j++){
            if(ar[min]>ar[j]){
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
        public static void square(int[] ar){
        for(int s=0;s<ar.length;s++){
            ar[s]=(int)(Math.pow(ar[s],2));
        }
       
        }

}
