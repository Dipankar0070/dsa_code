package Recursion;
import java.util.*;
public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,5,7,5,6,5,5};
		System.out.println(FirstIndex(arr,0,5));
	}
	public static int FirstIndex(int [] arr ,int index ,int item) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==item) {
			return index;
		}
	
		int fn=FirstIndex(arr,index+1,item);
		return fn;
	}

}
