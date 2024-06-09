package Stack;

import java.util.*;

public class Largest_Rectangle_In_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Area(arr));
	}

	public static int Area(int[] arr) {
//int[] ans=new int[arr.length];
		Stack<Integer> st = new Stack<>();
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {

				int height = arr[st.pop()];
				int R = i;
				if (!st.isEmpty()) {

					// ans=arr[st.pop()]*(i-st.peek()-1);
					// ans=height*(R-L-1);

					int L = st.peek();

					int Area = height * (R - L - 1);
					ans = Math.max(Area, ans);
				} else {

					int Area = height * R;
					ans = Math.max(Area, ans);

				}

			}

			st.push(i);

		}
		int R = arr.length;

		while (!st.isEmpty()) {
			int height = arr[st.pop()];

			if (!st.isEmpty()) {
				int L = st.peek();
				int Area = height * (R - L - 1);
				ans = Math.max(Area, ans);
			} else {
				int Area = height * R;
				ans = Math.max(Area, ans);

			}

		}
		return ans;
	}
}
