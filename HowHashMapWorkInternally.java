package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HowHashMapWorkInternally {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Nave", 190);
		marks.put("Tom", 200);
		marks.put("Luisa", 300);
		marks.put("Peter", 500);
		marks.put("robby", 600);
		marks.put(null, 500);
		
		//hashing: hashCode() -- > hashing
		
		System.out.println(marks.get("Luisa"));
		
	}

}
