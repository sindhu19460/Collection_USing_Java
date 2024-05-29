package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsUsingLinkedHashSet {
	public static void main(String[] args) {
		
		//1. LinkedHasset
		
		ArrayList<Integer> num  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,5,6,7,8,9,10));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(num);
		ArrayList<Integer> num2  = new ArrayList<Integer>(linkedHashSet);
		System.out.println(num2);
		
		//2.JDK 8- Stream:
		ArrayList<Integer> num21  = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,5,6,7,8,9,10));
		List<Integer> markListUnique = num21.stream().distinct().collect(Collectors.toList());
		System.out.println(markListUnique);
		

	}
}
