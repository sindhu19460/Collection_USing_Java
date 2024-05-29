package HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingHashMapInDiffWays {
	
	public static Map<String,Integer> marksMap;
	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A",100);
		marksMap.put("B",200);
	}

	public static void main(String[] args) {
		
		//1.Using hashmap class
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String,String> map2 =new HashMap<String,String>();
		
		//2. static way: static hashmap
		System.out.println(CreatingHashMapInDiffWays.marksMap.get("B"));
		
		
		//3. ImmutableMap with only one single entry:
		Map<String, Integer> map3 = Collections.singletonMap("testing",20);
		
		System.out.println(map3.get("testing"));
		//map3.put("abc", 100); Error unsupported exception
		
		//4.JDK 8
		//Creating one 2dd array of string using stream and collecting in the form map
		
		Map<String,String> map4 = Stream.of(new String[][]
				{
			{"Tom","A Grade"},
			{"Naveen","A+ Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa","B++ Grade");
		System.out.println(map4.get("Lisa"));
		
		
		//Using simplyEntry:
		
		Map<String, String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen","Java"),
				new AbstractMap.SimpleEntry<>("Tom","Python")
				).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		System.out.println(map5.get("Naveen"));
		
		//JDK1.9
		//empty map:
		//Immutable Maps:

		Map<String,String> emptyMap = Map.of();
		//emptyMap.put("Tom","Python");
		//System.out.printlnemptyMap.get("Tom")); // UnsupportedoperationException
		
		//SingleTonMap
		//Immutable Maps:

		Map<String,String> singletonMap = Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
		//singletonMap.put("k2","v2"); //UnsupportedoperationException
		
		//Multi Values Map: max 10 pairs can be stored
		//Immutable Maps:

		Map<String,String> multipMap = Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(multipMap.get("k1"));
		multipMap.put("k4","v4");
		//System.out.println("MP="+multipMap.get("k4"));

		
		//ofEntries method: no limitattion on pairs(key-values)
		//Immutable Maps:
		Map<String,Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300)
				);
		System.out.println(map7.get("C"));
		//map7.put("D", 400); //UnsupportedoperationException
		
		//Maps using Guava
		//ImmutableMap
		//Map<String,String> titleMap = ImmutableMap.of("g","gi","a","ai");
		//System.out.println(titleMap.get("a"));
		
	}

}
