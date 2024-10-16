package set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset treeset,linkedhasset implements set interface
		//does not accept duplicate values
		//there is no guarantee that elements are stored in sequential order
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
//		System.out.println(hs);
//		System.out.println(hs.remove("UK"));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.size());
		
		
		Iterator<String> i= hs.iterator();
//		i.next();
//		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
