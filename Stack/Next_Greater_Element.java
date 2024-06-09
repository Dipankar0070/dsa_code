package Stack;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		NGE(arr);

	}

	public static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {

				ans[st.pop()] = arr[i]; // peek nahi use krenge kyonki ab uske niche wala ka use hoga. isindex ka kaam
										// khatam.

			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		for (int z = 0; z < ans.length; z++) {
			System.out.println(arr[z] + " " + ans[z]);
		}
	}

}
