package Assign___TwoD_Array_Binary_Search;
import java.util.*;
public class Column_with_maximum_sum_in_a_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int M = sc.nextInt();
		int[][] arr = new int[M][M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		ArrayList<Integer> ll=new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int sum=0;
			for (int j = 0; j < M; j++) {
			sum+=arr[j][i];
			}
			ll.add(sum);
			}
		int max=Collections.max(ll);
		int idx=ll.indexOf(max);
		System.out.println(idx+1+" "+max);
		}

}
