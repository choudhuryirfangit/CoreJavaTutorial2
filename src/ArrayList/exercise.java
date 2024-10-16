package ArrayList;

import java.util.ArrayList;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        
        System.out.println(a);
        
        a.remove(0);
        
        System.out.println(a);
        
        if(a.contains("orange")){
            System.out.println("orange is found");
        }else{
            System.out.println("Orange is not found");
        }
        
        System.out.println(a.size());
        
        for(int i=0;i<a.size();i++){
            
                String name=a.get(i);
                System.out.println(name);
                System.out.println(a.indexOf(name));
        }
        
    }
		

	}
