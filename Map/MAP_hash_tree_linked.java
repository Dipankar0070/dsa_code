package Map;

import java.util.*;

public class MAP_hash_tree_linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// Map<String,Integer> map=new HashMap<>();
		map.put("Dhoni", 66);
		map.put("Sehwag", 61);
		map.put("Gambhir", 97);
		map.put("Sachin", 56);
		map.put("Ganguly", 82);
		map.put("Virat", 90);
		map.put("Yuvraj", 78);
		map.put("Raina", 100);
		// if repeated then recent value will be taken
		map.put("Dhoni", 91);
		System.out.println(map.remove("Dhoni"));
	//	map.put(null,53);
		System.out.println(map);
		System.out.println(map.get("Yuvraj"));
		System.out.println(map.get("Bhajji"));
		System.out.println(map.containsKey("Irfan"));
		System.out.println(map.containsKey("Gambhir"));
	//	System.out.println(map.remove("Ganguly"));
		System.out.println(map.remove("Munaf"));
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Tree map
		
	//	isme saara operation same hoga hashmap jaisa hi
		//Map<String,Integer> map1=new TreeMap<>();
		TreeMap<String,Integer> map1= new TreeMap<>();
		map1.put("Dhoni", 66);
		map1.put("Sehwag", 61);
		map1.put("Gambhir", 97);
		map1.put("Sachin", 56);
		map1.put("Ganguly", 82);
		map1.put("Virat", 90);
		map1.put("Yuvraj", 78);
		map1.put("Raina", 100);
		// if repeated then recent value will be taken
		map1.put("Dhoni", 91);
		System.out.println(map1);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Linked hash map
		//isme bhi saara operation same hoga hash map aur tree map ke jaisa
	
		LinkedHashMap<String , Integer> map2=new LinkedHashMap<>();
		map2.put("Dhoni", 66);
		map2.put("Sehwag", 61);
		map2.put("Gambhir", 97);
		map2.put("Sachin", 56);
		map2.put("Ganguly", 82);
		map2.put("Virat", 90);
		map2.put("Yuvraj", 78);
		map2.put("Raina", 100);
		// if repeated then recent value will be taken
		map2.put("Dhoni", 91);
		System.out.println(map2);
		
		
		
		/*
		 * Set<String> key=map.keySet(); for(String k:key) {
		 * System.out.println(k+" "+map.get(k)); }
		 */
		for(String k:map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
		
		ArrayList<String> ll=new ArrayList<>(map.keySet());
		System.out.println(ll);
	}

}
