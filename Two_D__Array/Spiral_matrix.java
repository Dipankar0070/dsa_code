package Two_D__Array;

import java.util.*;

public class Spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] arr = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer> ll=new ArrayList<>(); 
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		int count = 0;
		int total_element = arr.length * arr[0].length;
		while (count < total_element) {
			for (int i = minCol; i <= maxCol && count < total_element; i++) {
			//	System.out.print(arr[minRow][i]+ ", ");
				ll.add(arr[minRow][i]);
				count++;
			}
			minRow++;
			for (int i = minRow; i <= maxRow && count < total_element; i++) {
				//System.out.print(arr[i][maxCol] + ", ");
				ll.add(arr[i][maxCol]);
				count++;
			}
			maxCol--;
			for (int i = maxCol; i >= minCol && count < total_element; i--) {
				//System.out.print(arr[maxRow][i] + ", ");
				ll.add(arr[maxRow][i]);
				count++;
			}
			maxRow--;
			for (int i = maxRow; i >= minRow && count < total_element; i--) {
				//System.out.print(arr[i][minCol]+ ", ");
				ll.add(arr[i][minCol]);
				count++;
			}
			minCol++;
		}
		//System.out.print("END");
		System.out.println(ll);
	}

}
