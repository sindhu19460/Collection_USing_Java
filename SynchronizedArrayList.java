package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		//1: Collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add,remove - we don't need explicit synchronization
		// to fetch/traverse the values from this list -- we have to use  explicit synchronization
		
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}			
		}
		
		System.out.println("----------------------------");
		
		//2. CopyOnWriteArrayList -- its a class in jdk
		// its already threadsafe and synchronization
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("Athi");
		empList.add("Prashi");
		empList.add("sindhu");
		
		//We don't explicit synchronization for any operation: add/remove/traverse
		Iterator<String> newIt = empList.iterator();
		
		while(newIt.hasNext())
		{
			System.out.println(newIt.next());
		}
		
		
	}
}
