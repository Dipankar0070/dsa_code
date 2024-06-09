	package Stack;

import java.util.*;

public class Stock_Span_OR_Sunny_Building {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		StockSpan(arr);
		System.out.println("END");
	}

	public static void StockSpan(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
				st.pop();

			}
			if (st.isEmpty()) { 
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}

		for (int z = 0; z < ans.length; z++) {
			System.out.print(ans[z] + " ");
		}
	}

}
