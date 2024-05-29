package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethodTwo {
	public static void main(String args[])
	{
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("python");
		ar.add("java");
		ar.add("R");
		ar.add("C");
		ar.add("cpp");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Testing in java");
		ar2.add("Testing in python");
		ar2.add("dev ops");
		
		//ar.addAll(5,ar2);
		//System.out.println(ar);
		//ar.clear();
		//System.out.println(ar);
		@SuppressWarnings("unchecked")
		ArrayList<String> CloneList=(ArrayList<String>)ar.clone(); 
		System.out.println(CloneList);
		
		System.out.println(CloneList.contains("python"));
		System.out.println(CloneList.indexOf("R"));
		
		
		ArrayList<String> ListTwo = new ArrayList<String>(Arrays.asList("Athi","Prashi","Athi","Bhoomika","Athi"));
		
		System.out.println(ListTwo);
		
		int i = ListTwo.lastIndexOf("Athi");
		System.out.println(i);
		
		int i1 = ListTwo.lastIndexOf("Test");
		System.out.println(i1);
		
		String remove = ListTwo.remove(1);
		System.out.println(remove);
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		
		number.removeIf(num -> num%2 == 0);
		System.out.println(number);
		
		ArrayList<Integer> number2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		
		number2.removeIf(num -> num%2 != 0 );
		System.out.println(number2);
		
		ArrayList<String> NameList = new ArrayList<String>(Arrays.asList("Athi","Prashi","Athi","Bhoomika","Athi"));
		NameList.retainAll(Collections.singleton("Athi"));
		System.out.println(NameList);
		
		ArrayList<Integer> number3 = new ArrayList<Integer>
									(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		ArrayList<Integer> SubList = new ArrayList<Integer>(number3.subList(1,6));
		System.out.println(SubList);
		
		
		ArrayList<String> ListThree = new ArrayList<String>
						(Arrays.asList("Athi","Prashi","Athi","Bhoomika","Athi"));
		
		Object arr[] = ListThree.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o: arr)
		{
			System.out.println(o);
		}


	}

}
