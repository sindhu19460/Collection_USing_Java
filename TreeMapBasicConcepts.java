package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasicConcepts {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> marks	= new TreeMap<>();
		
		marks.put("Nave", 190);
		marks.put("Peter", 500);
		marks.put("Luisa", 300);
		marks.put("robby", 600);
		marks.put("Tom", 200);
		
		System.out.println(marks);
		marks.forEach((k,v) -> System.out.println("key="+k+" Values="+v));
		System.out.println(marks.lastKey());
		System.out.println(marks.firstKey());
		
		Set<String>  KeyLessThanTomValue = marks.headMap("Tom").keySet();
		System.out.println(KeyLessThanTomValue);
		
		Set<String> KeyGreatherThanPeter = marks.tailMap("Peter").keySet();
		System.out.println(KeyGreatherThanPeter);
		
		
		TreeMap<Integer, String> marks2	= new TreeMap<>();
		
		marks2.put(190,"Nave");
		marks2.put(500,"Peter");
		marks2.put(300,"Luisa");
		marks2.put(600,"robby");
		marks2.put(200,"Tom");
		
		System.out.println(marks2);
		marks2.forEach((k,v) -> System.out.println("key="+k+" Values="+v));
		System.out.println(marks2.lastKey());
		System.out.println(marks2.firstKey());
		
		Set<Integer>  KeyLessThanTomValue1 = marks2.headMap(500).keySet();
		System.out.println(KeyLessThanTomValue1);
		
		Set<Integer> KeyGreatherThanPeter1 = marks2.tailMap(300).keySet();
		System.out.println(KeyGreatherThanPeter1);
		
		TreeMap<Integer, String> RevOrde = new TreeMap<Integer, String>(Comparator.reverseOrder());
		RevOrde.put(190,"Nave");
		RevOrde.put(500,"Peter");
		RevOrde.put(300,"Luisa");
		RevOrde.put(600,"robby");
		RevOrde.put(200,"Tom");
		
		System.out.println(RevOrde);
		
	}

}
