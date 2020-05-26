package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//hashmap -- <k,v>
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Java");
		map.put(2, "Ruby");
		map.put(3, "Python");
		
		System.out.println(map.get(1));
		System.out.println(map.get(4));
		
//		for(Map.Entry<Integer, String> entry : map.entrySet()){
//			System.out.println("key = " + entry.getKey() + "value = "+ entry.getValue());
//		}
		
		map.forEach((k,v) -> System.out.println("key =" + k + " value = " +v));
		
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		map1.put(4, 200);
		map1.put(5, null);
		map1.put(null, 600);
		map1.put(null, 700);

		System.out.println(map1.get(2));
		System.out.println(map1.get(5));
		System.out.println(map1.get(null));

		
		
	}

}
