package OOPS_2;

import java.util.*;

public class Cars_client_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars_comparator[] arr = new Cars_comparator[5];
		arr[0] = new Cars_comparator(11000, 1890, "White");
		arr[1] = new Cars_comparator(2000, 20, "Blue");
		arr[2] = new Cars_comparator(35000, 1130, "Black");
		arr[3] = new Cars_comparator(4000, 4500, "Red");
		arr[4] = new Cars_comparator(50500, 5, "Orange");
	//	sort(arr,new Cars_comparator_speed());
		//sort(arr,new Cars_comparator_price());
		sort(arr,new Cars_comparator_color());
		Display(arr);

	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static <T> void sort(T[] ar,Comparator<T> camp) {
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i; j++) {
				if (camp.compare(ar[j],ar[j+1]) > 0) {
					T temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
	}

}
