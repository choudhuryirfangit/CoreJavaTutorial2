package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> i=new HashMap<Integer, String>();
		
		i.put(0, "Hello");
		i.put(2, "There");
		i.put(4, "Morning");
		i.put(6, "Goodbye");
		i.put(9, "❤️❤️❤️");
		i.put(11, "See you soon");
		
		
		System.out.println(i.get(9));
		i.remove(9);
		System.out.println(i.get(9));
		System.out.println(i.get(11));
		
		Set sn= i.entrySet();
		Iterator ie= sn.iterator();
		
		while(ie.hasNext()) {
			Map.Entry mp= (Map.Entry)ie.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
