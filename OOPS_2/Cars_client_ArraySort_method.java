package OOPS_2;
import java.util.*;
public class Cars_client_ArraySort_method {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cars_ArraySort_method[] arr=new Cars_ArraySort_method[5];
arr[0]=new Cars_ArraySort_method(11000,1890,"White");
arr[1]=new Cars_ArraySort_method(2000,20,"Blue");
arr[2]=new Cars_ArraySort_method(35000,1130,"Black");
arr[3]=new Cars_ArraySort_method(4000,4500,"Red");
arr[4]=new Cars_ArraySort_method(50500,5,"Orange");
//Arrays.sort(arr);
Arrays.sort(arr,new Comparator<Cars_ArraySort_method>()
{

	@Override
	public int compare(Cars_ArraySort_method o1, Cars_ArraySort_method o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}
	
});
Display(arr);

	}
	public static <T> void Display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}


}
