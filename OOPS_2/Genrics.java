package OOPS_2;

public class Genrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		Display(arr);
		String[] arr2 = { "RAM", "RAJ", "Rohan" };
		Display(arr2);
	}
	// public static void Display(Integer [] arr) {
	// for(int i=0;i<arr.length;i++) {
	// System.out.print(arr[i]+" ");
	// }
	// System.out.println();
//	}

//	public static void Display(String [] arr) {
	// for(int i=0;i<arr.length;i++) {
	// System.out.print(arr[i]+" ");
	// }
//	
	//<> is bracket ke ander kuch bhi daal skte hai<laal>,<T>
	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
