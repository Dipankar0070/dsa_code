package Map;

public class My_HashMap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_HashMap map=new My_HashMap();
		map.put("jethiya",88);
		map.put("popatiya",99);
		map.put("sodhi",197);
		map.put("mehtus",67);
		System.out.println(map);
		System.out.println(map.containsKey("bhindi"));
		System.out.println(map.get("sodhi"));
		System.out.println(map.remove("popatiya"));
		System.out.println(map);
		System.out.println(map.remove("popatiya"));
		System.out.println(map);
	}

}
