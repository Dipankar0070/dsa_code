package Time_Complexity;

import java.util.*;

public class Power_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(pow(x, n));
	}

	public static int pow(int x, int n) {

		if (n == 1) {
			return x;
		}
		int ans = pow(x, n / 2);
		ans = ans * ans;
		if (n % 2 != 0) {
			ans = ans * x;
		}
		return ans;
	}

}
