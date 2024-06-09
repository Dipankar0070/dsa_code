package Assign___String_Sliding_Window;
import java.util.*;
public class MB_Longest_K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int k = sc.nextInt();
			System.out.println(sub(str, k));
		}
	}

	public static int sub(String s, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int[] freq = new int[256];
		int count = 0;
		while (ei < s.length()) {
			char ch = s.charAt(ei);
			if(freq[ch]==0) {
				count++;
			}
			freq[ch]++;
			while (count>k) {
				char c = s.charAt(si);
				freq[c]--;
                if(freq[c]==0){
                    count--;
                }
				si++;
			}
            if(count==k){
			ans = Math.max(ei - si + 1, ans);
            }
			ei++;
		}
		return ans;
	}

}
