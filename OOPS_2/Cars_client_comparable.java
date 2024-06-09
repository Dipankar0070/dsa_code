package OOPS_2;

import java.util.Arrays;

public class Cars_client_comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cars_comparable[] arr=new Cars_comparable[5];
	arr[0]=new Cars_comparable(11000,1890,"White");
	arr[1]=new Cars_comparable(2000,20,"Blue");
	arr[2]=new Cars_comparable(35000,1130,"Black");
	arr[3]=new Cars_comparable(4000,4500,"Red");
	arr[4]=new Cars_comparable(50500,5,"Orange");
sort(arr);
Display(arr);

	}
	public static <T> void Display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static <T extends Comparable<T>> void sort(T[] ar) {
		for(int i=1;i<ar.length;i++) {
			for(int j=0;j<ar.length-i;j++) {
				if(ar[j].compareTo(ar[j+1])>0) {
					T temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}

}
