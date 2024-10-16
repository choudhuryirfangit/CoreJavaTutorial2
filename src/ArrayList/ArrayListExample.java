package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Irfan");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Hello");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		System.out.println(a.contains("Selenium"));
		System.out.println(a.contains("Irfan"));
		
		System.out.println(a.indexOf("Hello"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		//it can accept duplicate values
		a.add("java");
		a.remove(0);

		

	}

}
