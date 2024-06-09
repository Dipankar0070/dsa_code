package Stack;

import java.util.*;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(celeb(arr));
	}

	public static int celeb(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();

			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == st.peek()) {
				continue;
			}
			if (arr[st.peek()][i] != 0 || arr[i][st.peek()] != 1) {
				return -1;
			}

		}
		return st.pop();
	}
}





