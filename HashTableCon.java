package HashMap;

import java.util.Hashtable;

public class HashTableCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Hashtable<Integer, String> marks2 = new Hashtable<Integer, String>();
		marks2.put(190,"Nave");
		marks2.put(500,"Peter");
		marks2.put(300,"Luisa");
		marks2.put(600,"robby");
		marks2.put(200,"Tom");
		
		System.out.println(marks2.get(500));
		System.err.println(marks2.get(200));

	}

}
