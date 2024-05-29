package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capMap = new HashMap<String, String>();
		
		capMap.put("1", "Name");
		capMap.put("2", "Sindhu");
		capMap.put("3", "Sandhya");
		System.out.println(capMap.get("1"));
		
		Iterator<String> it = capMap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = capMap.get(key);
			System.out.println("Key ="+key+"value="+value);
		}
		
		Iterator<Entry<String,String>> it1 = capMap.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Entry<String,String> entry = it1.next();
			System.out.println("Key="+entry.getKey());
			System.out.println("Value="+entry.getValue());
		}
		
		capMap.forEach((k,v)->System.out.println("Key="+k+"Value="+v));
		

	}

}
