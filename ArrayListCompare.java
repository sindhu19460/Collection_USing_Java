package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","C","B","D","F"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","C","B","D","F"));

		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l3));
		
		//2. Compare two list - find out the additional elements
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","C","B","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","C","B","D","E"));
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		//3. find out the missing elements
		
		l5.removeAll(l4);
		System.out.println(l5);
		
		//Find out the common elements
		ArrayList<String> lang = new ArrayList<String>(Arrays.asList("Python","C","Java","Cpp","R"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Python","C","Java","C#","R"));
		
		
		lang.retainAll(lang2);
		System.out.println(lang);
	}

}
