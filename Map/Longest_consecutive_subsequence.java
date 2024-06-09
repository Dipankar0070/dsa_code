package Map;
import java.util.*;
public class Longest_consecutive_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,4,8,5,1,10,3,14,15,18,12,16,11};
		My_HashMap<Integer,Boolean> map= new My_HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i],false);
			}
			else {
				map.put(arr[i],true);
			}
			if(map.containsKey(arr[i]+1)) {
			map.put(arr[i]+1,false);	
			}
		}
		int ans=0;
		for(int v:map.keySet()) {
			if(map.get(v)) {
				int count=0;
				while(map.containsKey(v)) {
					count++;
					v++;
				}
				ans=Math.max(ans, count);
			}
			
		}
		System.out.println(ans);
	}

}
