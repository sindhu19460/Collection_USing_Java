package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("1","A");
		map1.put("2","B");
		map1.put("3", "c");
		
		//create SynchronizedMap
		
		Map<String,String> synMap = Collections.synchronizedMap(map1);
		System.out.println(synMap);
		
		//concurrentHashMap: it doesn't throw any concurrentmodificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("A", "Python");
		concurrentMap.put("B", "Java");
		concurrentMap.put("C", "Cpp");
		
		System.out.println(concurrentMap.get("A"));
		
	}

}
