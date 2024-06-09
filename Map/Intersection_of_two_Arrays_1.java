package Map;
import java.util.ArrayList;
import java.util.HashMap;
public class Intersection_of_two_Arrays_1 {

	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr1= {2,3,1,4,5,3,7,1,2,4,5};
			int[] arr2= {2,1,3,3,4,3,7,2,2,7,11,15,3};
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i],map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i],1);
			}
			}
			ArrayList<Integer> ll=new ArrayList<>();
		

			for(int i=0;i<arr2.length;i++) {
				if (map.containsKey(arr2[i])&& map	.get(arr2[i])>0) {
					ll.add(arr2[i]);
					map.remove(arr2[i]);
				}
				
			}
			System.out.println(ll);
		}

	}